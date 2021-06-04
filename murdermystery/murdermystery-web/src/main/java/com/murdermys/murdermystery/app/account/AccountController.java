package com.murdermys.murdermystery.app.account;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.murdermys.murdermystery.domain.model.account.Account;
import com.murdermys.murdermystery.domain.service.userDetails.SampleUserDetails;

@Controller
@RequestMapping("account")
public class AccountController {

    @GetMapping
    public String view(
            @AuthenticationPrincipal SampleUserDetails userDetails, // (1)
            Model model) {
        // (2)
        Account account = userDetails.getAccount();
        model.addAttribute(account);
        return "account/view";
    }
}