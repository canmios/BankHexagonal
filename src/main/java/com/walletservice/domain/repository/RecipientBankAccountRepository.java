package com.walletservice.domain.repository;

import com.walletservice.domain.model.recipient.RecipientBankAccount;

import java.util.Optional;

public interface RecipientBankAccountRepository {

    RecipientBankAccount save(RecipientBankAccount recipientBankAccount);

    Optional<RecipientBankAccount> findByUserId(Long userId);

}
