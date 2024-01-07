package com.asteric.cabbookuser.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "CAB_LOCATION_TOPIC", groupId = "user-group")
    public void cabLocation(String location) {
        System.out.println(location);
    }
}
