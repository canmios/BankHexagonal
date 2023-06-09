package com.walletservice.infrastructure.repository.wallet.adapter;

import com.walletservice.domain.model.wallet.WalletBankAccount;
import com.walletservice.domain.repository.WalletBankAccountRepository;
import com.walletservice.infrastructure.repository.wallet.mapper.WalletBankAccountRepositoryMapper;
import com.walletservice.infrastructure.repository.wallet.WalletBankAccountEntityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class WalletBankAccountRepositoryAdapter implements WalletBankAccountRepository {

    private final WalletBankAccountEntityRepository walletBankAccountEntityRepository;

    private static final Long CURRENT_WALLET_BANK_ACCOUNT_ID = 1L;

    private final WalletBankAccountRepositoryMapper walletBankAccountRepositoryMapper
            = WalletBankAccountRepositoryMapper.INSTANCE;

    @Override
    public Optional<WalletBankAccount> getCurrentWalletBankAccount() {
        return walletBankAccountEntityRepository.findById(CURRENT_WALLET_BANK_ACCOUNT_ID)
                .map(walletBankAccountRepositoryMapper::toWalletBankAccount);
    }
}
