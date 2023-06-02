package com.walletservice.domain.service.fee;

import com.walletservice.domain.model.fee.TransactionFee;

public interface FeeService {

    TransactionFee calculateFee(Double amount);

}
