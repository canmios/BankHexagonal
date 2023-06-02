package com.walletservice.application.mapper;

import com.walletservice.application.dto.recipient.RecipientBankAccountRequest;
import com.walletservice.application.dto.recipient.RecipientBankAccountResponse;
import com.walletservice.domain.model.recipient.RecipientBankAccount;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecipientBankAccountMapper {

    RecipientBankAccountMapper INSTANCE = Mappers.getMapper(RecipientBankAccountMapper.class);


    RecipientBankAccountResponse toBankAccountResponse(RecipientBankAccount recipientBankAccount);

    @Mapping(target = "userId", ignore = true)
    @Mapping(target = "id", ignore = true)
    RecipientBankAccount toBankAccount(RecipientBankAccountRequest recipientBankAccountRequest);

}
