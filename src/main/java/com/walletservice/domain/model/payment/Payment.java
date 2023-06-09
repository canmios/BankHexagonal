package com.walletservice.domain.model.payment;

import com.walletservice.domain.model.recipient.RecipientBankAccount;
import com.walletservice.domain.model.wallet.WalletTransaction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Payment implements Serializable  {

    private Long id;
    private String transactionId;

    private RecipientBankAccount bankAccount;

    private Long userId;

    private Double amount;

    private Double fee;

    private LocalDateTime created;

    private WalletTransaction walletTransaction;

    private List<PaymentState> paymentStates;



}
