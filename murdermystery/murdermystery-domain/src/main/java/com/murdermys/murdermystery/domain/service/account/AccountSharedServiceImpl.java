package com.murdermys.murdermystery.domain.service.account;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.terasoluna.gfw.common.exception.ResourceNotFoundException;
import org.terasoluna.gfw.common.message.ResultMessage;
import org.terasoluna.gfw.common.message.ResultMessages;

import com.murdermys.murdermystery.domain.model.account.Account;
import com.murdermys.murdermystery.domain.repository.account.AccountRepository;

@Service
@Transactional
public class AccountSharedServiceImpl implements AccountSharedService {

    @Inject
    AccountRepository accountRepository;

    @Transactional(readOnly=true)
    @Override
    public Account findOne(String username) {
        // (1)
        Account account = accountRepository.findOne(username);
        // (2)
        if (account == null) {
            ResultMessages messages = ResultMessages.error();
            messages.add(ResultMessage.fromText(
                    "The given account is not found! username=" + username));
            throw new ResourceNotFoundException(messages);
        }
        return account;
    }
}
