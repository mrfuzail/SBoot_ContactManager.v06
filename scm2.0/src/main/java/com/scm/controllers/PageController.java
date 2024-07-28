package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PageController {
@RequestMapping("/home")
public String home(Model model){

    //sending data to view
    model.addAttribute("name", "TechProjects");
    model.addAttribute("youtubechannel", "Learn Code with Fuzail");
    model.addAttribute("githubRepo", "https://github.com/mrfuzail/mrfuzail/tree/main");
    System.out.println("home page handler");
return "home";
}


// about route
@RequestMapping("/about")
public String aboutPage(Model model){
    model.addAttribute("isLogin", false);
System.out.println("About page loading ");
return "about";
}


//services
@RequestMapping("/services")
public String servicesPage(){
System.out.println("services page loading ");
return "services";
}

}
