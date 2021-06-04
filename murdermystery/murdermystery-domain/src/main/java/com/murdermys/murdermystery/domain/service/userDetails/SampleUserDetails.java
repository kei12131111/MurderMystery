package com.murdermys.murdermystery.domain.service.userDetails;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.murdermys.murdermystery.domain.model.account.Account;



public class SampleUserDetails extends User { // (1)
    private static final long serialVersionUID = 1L;

    private final Account account; // (2)

    public SampleUserDetails(Account account) {
        // (3)
        super(account.getUsername(), account.getPassword(), AuthorityUtils
                .createAuthorityList("ROLE_USER")); // (4)
        this.account = account;
    }

    

    
    
    public Account getAccount() { // (5)
        return account;
    }

}
