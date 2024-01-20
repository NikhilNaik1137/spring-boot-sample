package com.sample.springboot.client;

import lombok.*;

import java.time.LocalDate;


@Data
public class Client {

    private String id;
    private String name;
    private Long clientId;
    private LocalDate initializationDate;
    private Integer durationInDays;

    public Client(String name, Long clientId, LocalDate initializationDate, Integer durationInDays) {
        this.name = name;
        this.clientId = clientId;
        this.initializationDate = initializationDate;
        this.durationInDays = durationInDays;
    }
}
