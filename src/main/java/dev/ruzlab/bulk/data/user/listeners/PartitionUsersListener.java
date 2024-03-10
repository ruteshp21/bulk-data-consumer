package dev.ruzlab.bulk.data.user.listeners;

import dev.ruzlab.bulk.data.user.service.UserService;
import dev.ruzlab.bulk.data.user.dao.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PartitionUsersListener {

    private final UserService userService;

    public PartitionUsersListener(UserService userService) {
        this.userService = userService;
    }

    @KafkaListener(topics = "partition-users", containerFactory = "kafkaListenerContainerFactory")
    public void consumer(List<UserDTO> message) {
        userService.processUserRecords(message);
    }
}
