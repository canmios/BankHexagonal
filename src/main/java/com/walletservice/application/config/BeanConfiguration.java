package com.walletservice.application.config;

import com.walletservice.domain.client.PaymentProviderClient;
import com.walletservice.domain.client.WalletClient;
import com.walletservice.domain.repository.PaymentRepository;
import com.walletservice.domain.repository.RecipientBankAccountRepository;
import com.walletservice.domain.repository.WalletBankAccountRepository;
import com.walletservice.domain.repository.WalletTransactionRepository;
import com.walletservice.domain.service.fee.DomainFeeService;
import com.walletservice.domain.service.fee.FeeService;
import com.walletservice.domain.service.recipient.RecipientBankAccountService;
import com.walletservice.domain.service.recipient.DomianRecipientBankAccountService;
import com.walletservice.domain.service.payment.DomainPaymentService;
import com.walletservice.domain.service.payment.PaymentService;
import com.walletservice.domain.service.wallet.DomainWalletService;
import com.walletservice.domain.service.wallet.WalletService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public RecipientBankAccountService bankAccountService(RecipientBankAccountRepository recipientBankAccountRepository) {
        return new DomianRecipientBankAccountService(recipientBankAccountRepository);
    }

    @Bean
    public PaymentService paymentService(RecipientBankAccountRepository recipientBankAccountRepository,
                                         WalletService walletService, PaymentRepository paymentRepository,
                                         PaymentProviderClient paymentProviderClient, FeeService feeService) {
        return new DomainPaymentService(recipientBankAccountRepository, paymentRepository, walletService,
                paymentProviderClient, feeService);
    }

    @Bean
    public WalletService walletService(WalletClient walletClient,
                                       WalletTransactionRepository walletTransactionRepository,
                                       WalletBankAccountRepository walletBankAccountRepository) {
        return new DomainWalletService(walletClient, walletTransactionRepository, walletBankAccountRepository);
    }

    @Bean
    public FeeService feeService() {
        return new DomainFeeService();
    }

}
