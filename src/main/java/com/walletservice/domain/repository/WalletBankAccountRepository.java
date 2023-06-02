package com.walletservice.domain.repository;

import com.walletservice.domain.model.wallet.WalletBankAccount;

import java.util.Optional;

public interface WalletBankAccountRepository {

    Optional<WalletBankAccount> getCurrentWalletBankAccount();

}
