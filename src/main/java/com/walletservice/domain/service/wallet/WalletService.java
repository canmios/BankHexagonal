package com.walletservice.domain.service.wallet;

import com.walletservice.domain.model.wallet.WalletTransaction;

public interface WalletService {

    WalletTransaction createWithdrawWalletTransaction(Long userId, Double amount);

    WalletTransaction createTopUpWalletTransaction(Long userId, Double amount);


    Double getWalletBalance(Long userId);
}
