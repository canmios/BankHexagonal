package com.walletservice.infrastructure.repository.wallet.mapper;

import com.walletservice.domain.model.wallet.WalletBankAccount;
import com.walletservice.infrastructure.repository.wallet.entity.WalletBankAccountEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WalletBankAccountRepositoryMapper {

    WalletBankAccountRepositoryMapper INSTANCE = Mappers.getMapper(WalletBankAccountRepositoryMapper.class);

    WalletBankAccount toWalletBankAccount(WalletBankAccountEntity walletBankAccountEntity);

}
