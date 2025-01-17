package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserViewController {

    @Autowired
    private UserController userController;

    @GetMapping("userView")
    public String createUserView(Model model) {
        model.addAttribute("users", userController.getAllUsers());
        return "userView";
    }
}
