package com.walletservice.domain.client;

import com.walletservice.domain.model.payment.PaymentProvider;
import com.walletservice.domain.model.payment.PaymentStatus;
import com.walletservice.domain.model.recipient.RecipientBankAccount;
import com.walletservice.domain.model.wallet.WalletBankAccount;

public interface PaymentProviderClient {

    PaymentProvider createPaymentProvider(WalletBankAccount originBank, RecipientBankAccount  recipientBank,
                                          Double amount);

    PaymentStatus getPaymentStatus(String paymentId);


}
