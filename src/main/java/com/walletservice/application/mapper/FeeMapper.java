package com.walletservice.application.mapper;

import com.walletservice.application.dto.fee.FeeResponse;
import com.walletservice.domain.model.fee.TransactionFee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FeeMapper {


    FeeMapper INSTANCE = Mappers.getMapper(FeeMapper.class);

    FeeResponse toTransactionFeeResponse(TransactionFee transactionFee);

}
