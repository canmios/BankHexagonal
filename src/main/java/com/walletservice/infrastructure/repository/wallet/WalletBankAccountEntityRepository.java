package com.walletservice.infrastructure.repository.wallet;

import com.walletservice.infrastructure.repository.wallet.entity.WalletBankAccountEntity;
import org.springframework.data.repository.CrudRepository;

public interface WalletBankAccountEntityRepository extends CrudRepository<WalletBankAccountEntity, Long> {
}
