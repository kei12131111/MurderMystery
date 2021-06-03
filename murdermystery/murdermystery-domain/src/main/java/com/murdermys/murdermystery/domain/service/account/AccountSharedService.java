package com.murdermys.murdermystery.domain.service.account;

import com.murdermys.murdermystery.domain.model.account.Account;

public interface AccountSharedService {
    Account findOne(String username);
}