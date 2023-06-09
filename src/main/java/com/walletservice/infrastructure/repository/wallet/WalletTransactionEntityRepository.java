package com.walletservice.infrastructure.repository.wallet;

import com.walletservice.infrastructure.repository.wallet.entity.WalletTransactionEntity;
import org.springframework.data.repository.CrudRepository;

public interface WalletTransactionEntityRepository extends CrudRepository<WalletTransactionEntity, String> {
}
