package com.murdermys.murdermystery.app.login;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

	
	@ModelAttribute
	public LoginForm setupForm() { // (1)
	    return new LoginForm();
	}

    @GetMapping("/loginForm") // (1)
    public String view() {
        return "login/loginForm";
    }
	
    
    
	
    @RequestMapping("/auth") // (1)
    public String login(@Validated LoginForm form, BindingResult result) {
        // omitted
        if (result.hasErrors()) {
            System.out.println("no name");
            return "login/loginForm";
        }
        
        System.out.println("ok");
        return "forward:/authentication"; // (2)
    }
}
