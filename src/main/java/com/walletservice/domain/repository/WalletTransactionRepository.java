package com.walletservice.domain.repository;

import com.walletservice.domain.model.wallet.WalletTransaction;

public interface WalletTransactionRepository {

    WalletTransaction save(WalletTransaction walletTransaction);

}
