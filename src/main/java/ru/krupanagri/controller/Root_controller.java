package ru.krupanagri.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.support.SessionStatus;
import ru.krupanagri.to.UserTo;
import ru.krupanagri.util.UserUtil;

import javax.validation.Valid;



@Controller
public class Root_controller extends AbstractUserController {


    @GetMapping("/")
    public String index(ModelMap model){
       // model.addAttribute("message", "Spring MVC XML Config Example");
        return "main";
        //return "forward:/views/main.html";
    }

    @GetMapping("/register")
    @ResponseStatus(value= HttpStatus.OK)
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

    @PostMapping("/register")
    public String saveRegister(@Valid UserTo userTo, BindingResult result, SessionStatus status, ModelMap model) {
        if (result.hasErrors()) {
            model.addAttribute("register", true);
            return "profile";
        } else {
            super.create(UserUtil.createNewFromTo(userTo));
            status.setComplete();
            return "redirect:login?message=app.registered&username=" + userTo.getEmail();
        }
    }



}