package com.walletservice.domain.service.fee;

import com.walletservice.domain.model.fee.TransactionFee;

public class DomainFeeService implements FeeService{
    @Override
    public TransactionFee calculateFee(Double amount) {
         Double fee = amount*0.10;
         return new TransactionFee(amount, fee, amount-fee);
    }
}
