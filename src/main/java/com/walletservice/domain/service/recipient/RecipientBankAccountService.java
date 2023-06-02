package com.walletservice.domain.service.recipient;

import com.walletservice.domain.model.recipient.RecipientBankAccount;

public interface RecipientBankAccountService {

    RecipientBankAccount createBankAccount(RecipientBankAccount recipientBankAccount);

    RecipientBankAccount getBankAccountByUserId(Long userId);

}
