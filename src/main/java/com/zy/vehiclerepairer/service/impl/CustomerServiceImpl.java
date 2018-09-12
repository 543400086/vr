package com.zy.vehiclerepairer.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.StringUtil;
import com.zy.vehiclerepairer.exception.BusinessException;
import com.zy.vehiclerepairer.mapper.CustomerMapper;
import com.zy.vehiclerepairer.model.Customer;
import com.zy.vehiclerepairer.service.ICustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private static Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Customer selectByPrimaryKey(Integer id) {
        Customer customer = null;
        try {
            customer = customerMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            logger.error(String.format("获取客户信息失败，错误信息%s", e));
        }
        return customer;
    }

  /*  public List<Customer> getList() {
        return customerMapper.getList();
    }*/

    @Override
    public Page<Customer> getList(String mobile, String plateNumber, Integer page, Integer limit) {
        Map params = new HashMap();
        if (mobile != null && !"".equals(mobile)) {
            params.put("mobile", mobile);
        }

        if (plateNumber != null && !"".equals(plateNumber)) {
            params.put("plateNumber", plateNumber);
        }

        PageHelper.startPage(page, limit);
        List<Customer> customerList = customerMapper.getList(params);
        Page<Customer> list = (Page) customerList;
        return list;
    }

    /**
     * 新增操作
     *
     * @param customer
     * @return
     */
    @Override
    public int insert(Customer customer) {
        List<Customer> customerList;
        int row = 0;
        /**参数合法性较验*/
        paramVerify(customer);
        /**查询当前记录是否已存在*/
        customerList = getListByMobileOrPlateNumber(customer.getMoble(), customer.getPlateNumber());
        if (customerList.size() != 0) {
            throw new BusinessException("已经存在该项");
        } else {
            row = customerMapper.insert(customer);
        }
        return row;
    }


    @Override
    public int update(Customer customer) {
        /**参数合法性较验*/
        paramVerify(customer);
        if (customer.getId() <= 0) {
            throw new BusinessException("客户Id不合法");
        }
        return customerMapper.updateByPrimaryKey(customer);
    }

    /**
     * 根据手机号或车牌号查询
     * @param mobile
     * @param plateNumber
     * @return
     */
    @Override
    public List<Customer> getListByMobileOrPlateNumber(String mobile, String plateNumber) {
        return customerMapper.getListByMobileOrPlateNumber(mobile, plateNumber);
    }


    /**
     * 参数较验
     *
     * @param customer
     */
    private void paramVerify(Customer customer) {
        if (StringUtil.isEmpty(customer.getCustomerName())) {
            throw new BusinessException("客户姓名不能为空");
        }
        if (StringUtil.isEmpty(customer.getMoble())) {
            throw new BusinessException("客户手机号不能为空");
        }
        if (StringUtil.isEmpty(customer.getPlateNumber())) {
            throw new BusinessException("车牌号不能为空");
        }
    }
}
