package com.walletservice.infrastructure.repository.wallet.adapter;

import com.walletservice.domain.model.wallet.WalletTransaction;
import com.walletservice.domain.repository.WalletTransactionRepository;
import com.walletservice.infrastructure.repository.wallet.entity.WalletTransactionEntity;
import com.walletservice.infrastructure.repository.wallet.mapper.WalletTransactionRepositoryMapper;
import com.walletservice.infrastructure.repository.wallet.WalletTransactionEntityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
public class WalletTransactionRepositoryAdapter implements WalletTransactionRepository {

    private final WalletTransactionEntityRepository walletTransactionEntityRepository;

    private final WalletTransactionRepositoryMapper walletTransactionRepositoryMapper
            = WalletTransactionRepositoryMapper.INSTANCE;


    @Override
    @Transactional
    public WalletTransaction save(WalletTransaction walletTransaction) {

        WalletTransactionEntity walletTransactionEntity = walletTransactionRepositoryMapper
                .toWalletTransactionEntity(walletTransaction);

        return walletTransactionRepositoryMapper
                .toWalletTransaction(walletTransactionEntityRepository.save(walletTransactionEntity));
    }
}
