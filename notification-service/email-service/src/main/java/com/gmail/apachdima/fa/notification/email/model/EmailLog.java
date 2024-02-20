package com.gmail.apachdima.fa.notification.email.model;

import com.gmail.apachdima.fa.common.constant.email.EmailStatus;
import com.gmail.apachdima.fa.common.constant.email.EmailType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "emails")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class EmailLog {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "email_", columnDefinition = "bpchar", unique = true, nullable = false)
    private String emailId;

    @Column(name = "send_by", nullable = false)
    private String sendBy;

    @Column(name = "send_to", nullable = false)
    private String sendTo;

    @Enumerated(EnumType.STRING)
    @Column(name = "email_type", nullable = false)
    private EmailType emailType;

    @Enumerated(EnumType.STRING)
    @Column(name = "email_status", nullable = false)
    private EmailStatus emailStatus;

    @Column(name = "send_time", nullable = false)
    private LocalDateTime sendTime;
}
