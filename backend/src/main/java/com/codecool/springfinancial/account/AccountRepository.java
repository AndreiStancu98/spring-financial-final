package com.codecool.springfinancial.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    List<Account> findByCustomerPid(String customerPid);

    Boolean existsByAccountNumber(String accountNumber);

    Account findByAccountNumber(String accountNumber);

    @Transactional
    @Modifying
    @Query("UPDATE Account a set a.amount = :amount WHERE a.accountNumber = :accountNumber")
    void transaction(@Param("accountNumber") String accountNumber, @Param("amount") Double amount);

}
