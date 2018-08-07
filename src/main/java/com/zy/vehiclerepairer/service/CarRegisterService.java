package com.zy.vehiclerepairer.service;

import com.zy.vehiclerepairer.mapper.CarRegisterMapper;
import com.zy.vehiclerepairer.model.CarRegisterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarRegisterService {
    @Autowired
    private CarRegisterMapper carRegisterMapper;


    public List<CarRegisterModel> getCarList() {
       // return carRegisterMapper.getCarList();
        return null;
    }
}
