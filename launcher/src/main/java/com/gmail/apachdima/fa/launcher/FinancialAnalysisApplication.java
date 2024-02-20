package com.gmail.apachdima.fa.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(
    scanBasePackages = {
        "com.gmail.apachdima.fa.launcher",
        "com.gmail.apachdima.fa.common",
        "com.gmail.apachdima.fa.user",
        "com.gmail.apachdima.fa.file.storage",
        "com.gmail.apachdima.fa.notification.email"
    })
@EnableJpaRepositories(basePackages = {
    "com.gmail.apachdima.fa.user",
    "com.gmail.apachdima.fa.file.storage",
    "com.gmail.apachdima.fa.notification.email"
})
@EntityScan(basePackages = {
    "com.gmail.apachdima.fa.user",
    "com.gmail.apachdima.fa.file.storage",
    "com.gmail.apachdima.fa.notification.email"
})
@EnableAsync
public class FinancialAnalysisApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinancialAnalysisApplication.class, args);
    }

}
