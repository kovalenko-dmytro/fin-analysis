package com.gmail.apachdima.fa.notification.email.repository;

import com.gmail.apachdima.fa.notification.email.model.EmailLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailLogRepository extends JpaRepository<EmailLog, String> {
}
