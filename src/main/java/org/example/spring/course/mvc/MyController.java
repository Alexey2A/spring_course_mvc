package org.example.spring.course.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showInfo(){
        return "info-test";
    }

    @RequestMapping("/askDetails")
    public String askManDetails(){
        return "ask-details-view";
    }

    @RequestMapping("/showDetails")
    public String showManDetails(@RequestParam("manName") String mName
            , Model model){

        mName = "Mr. " + mName + "!!!";
        model.addAttribute("nameAttribute", mName);

        return "show-details-view";
    }
}

