package ru.krupanagri.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RestController;


//@RequestMapping("/")
@Controller
public class Root_controller {

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping("/")
    public String index(ModelMap model){
       // model.addAttribute("message", "Spring MVC XML Config Example");
        return "main";
        //return "forward:/views/main.html";
    }

    @GetMapping("/register")
    public String register(ModelMap model) {
       // model.addAttribute("userTo", new UserTo());
        //model.addAttribute("register", true);
        return "profile";
    }

    @GetMapping("/product")
    public String product(ModelMap model){
        // model.addAttribute("message", "Spring MVC XML Config Example");
        return "product";
        //return "forward:/views/main.html";
    }

   /* @PostMapping("/register")
    public String saveRegister(@Valid UserTo userTo, BindingResult result, SessionStatus status, ModelMap model) {
        if (result.hasErrors()) {
            model.addAttribute("register", true);
            return "profile";
        } else {
            super.create(UserUtil.createNewFromTo(userTo));
            status.setComplete();
            return "redirect:login?message=app.registered&username=" + userTo.getEmail();
        }
    }*/



}