package com.walletservice.infrastructure.repository.payment;

import com.walletservice.infrastructure.repository.payment.entity.PaymentStateEntity;
import org.springframework.data.repository.CrudRepository;

public interface PaymentStateEntityRepository extends CrudRepository<PaymentStateEntity, Long> {
}
