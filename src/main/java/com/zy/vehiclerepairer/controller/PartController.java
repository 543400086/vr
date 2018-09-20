package com.zy.vehiclerepairer.controller;


import com.github.pagehelper.PageInfo;
import com.zy.vehiclerepairer.model.Part;
import com.zy.vehiclerepairer.service.IPartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/part")
public class PartController {
    @Autowired
    private IPartService partService;

    @RequestMapping("/index")
    public String index() {
        return "part/index";
    }

    @RequestMapping("/getList")
    @ResponseBody
    public List<Part> getList(Model model) {
        List<Part> pageInfo = partService.getList(null);
        return pageInfo;
    }
}
