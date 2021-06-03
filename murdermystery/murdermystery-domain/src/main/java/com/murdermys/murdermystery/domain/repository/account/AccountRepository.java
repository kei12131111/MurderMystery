package com.murdermys.murdermystery.domain.repository.account;

import com.murdermys.murdermystery.domain.model.account.Account;

public interface AccountRepository {
    Account findOne(String username);
}