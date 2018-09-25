package com.zy.vehiclerepairer.controller;

import com.github.pagehelper.PageInfo;
import com.zy.vehiclerepairer.exception.InvalidParamException;
import com.zy.vehiclerepairer.model.Customer;
import com.zy.vehiclerepairer.model.HttpResultStatusEnum;
import com.zy.vehiclerepairer.model.RestResponseBo;
import com.zy.vehiclerepairer.service.ICustomerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @RequestMapping("/get")
    public Customer getCustomer(Integer id) {
        return customerService.selectByPrimaryKey(id);
    }

    @RequestMapping("/index")
    @ResponseBody
    public RestResponseBo<PageInfo<Customer>> getList(@RequestParam(value = "page", defaultValue = "1") int page,
                                                      @RequestParam(value = "limit", defaultValue = "3") int limit,
                                                      Customer customer,
                                                      Model model) {

        PageInfo<Customer> customerPageInfo = customerService.getList(customer.getMobile(), customer.getPlateNumber(), page, limit);
        RestResponseBo restResponseBo = new RestResponseBo();
        restResponseBo.setData(customerPageInfo);
        restResponseBo.setCode(HttpResultStatusEnum.OK.getValue());
        restResponseBo.setMsg("请求成功");
//        model.addAttribute("customers", contentsPaginator);
        return restResponseBo;
    }


    @RequestMapping(value = "add")
    public boolean add(Customer customer) {
        validParam(customer);
        List<Customer> customerList = customerService.getListByMobileOrPlateNumber(customer.getMobile(), customer.getPlateNumber());
        if (customerList.size() > 0) {
            throw new InvalidParamException("当前信息已存！");
        }
        return customerService.insert(customer) > 0 ? true : false;
    }


    @RequestMapping(value = "update")
    public boolean update(Customer customer, HttpServletRequest request) {
        if (customer.getId() <= 0) {
            throw new InvalidParamException("id不合法~！");
        }
        validParam(customer);
        return customerService.update(customer) > 0 ? true : false;
    }

    /**
     * 验证参数
     *
     * @param customer
     */
    private void validParam(Customer customer) {
        if (StringUtils.isBlank(customer.getMobile())) {
            throw new InvalidParamException("手机号不能为空");
        }
        if (StringUtils.isBlank(customer.getCustomerName())) {
            throw new InvalidParamException("客户姓名不能为空");
        }
        if (StringUtils.isBlank(customer.getPlateNumber())) {
            throw new InvalidParamException("车牌号不能为空");
        }
    }
}
