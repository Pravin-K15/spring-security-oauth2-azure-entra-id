package com.springsecurity.oauth2;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControllerClass {
	
	@GetMapping
    public String land(Model model, Authentication user) {
        model.addAttribute("user", user);
        return "index";
    }

}
