package com.sample.springboot.client;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ClientService {

    public List<Client> getAllClients() {
        return List.of(
                new Client(
                        "Client1",
                        Long.valueOf(123123123),
                        LocalDate.of(2024, 05, 25),
                        365
                )
        );

    }
}
