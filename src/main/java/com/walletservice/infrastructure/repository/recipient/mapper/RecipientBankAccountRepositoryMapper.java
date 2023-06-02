package com.walletservice.infrastructure.repository.recipient.mapper;

import com.walletservice.domain.model.recipient.RecipientBankAccount;
import com.walletservice.infrastructure.repository.recipient.entity.RecipientBankAccountEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecipientBankAccountRepositoryMapper {

    RecipientBankAccountRepositoryMapper INSTANCE = Mappers.getMapper(RecipientBankAccountRepositoryMapper.class);

    RecipientBankAccountEntity toRecipientBankAccountEntity(RecipientBankAccount recipientBankAccount);

    RecipientBankAccount toRecipientBankAccount(RecipientBankAccountEntity recipientBankAccountEntity);

}
