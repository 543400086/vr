package com.zy.vehiclerepairer.controller;

import com.zy.vehiclerepairer.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shugui.zhang 2018/7/9 13:46
 */
@Controller
@RestController
public class PersonController {
    @RequestMapping("/index")
    public String index(Model model) {
        Person single = new Person("aa",11);
        List<Person> people = new ArrayList<>();
        Person p1 = new Person("zhangsan",11);
        Person p2 = new Person("lisi",22);
        Person p3 = new Person("wangwu",33);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        return "index";
    }
}
