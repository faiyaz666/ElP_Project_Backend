package com.example.coursemanagementservice.repository;

import com.example.coursemanagementservice.model.PaymentInfo;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, UUID> {

    List<PaymentInfo> findAllBy(PageRequest pageable);

    PaymentInfo findByTrxId(String trxId);
}