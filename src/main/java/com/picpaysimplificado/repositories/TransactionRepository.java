package com.picpaysimplificado.repositories;

import com.picpaysimplificado.domain.tansaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
