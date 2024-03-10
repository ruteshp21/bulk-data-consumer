package dev.ruzlab.bulk.data.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"dev.ruzlab.bulk.data.user"})
public class BulkDataConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BulkDataConsumerApplication.class, args);
    }

}
