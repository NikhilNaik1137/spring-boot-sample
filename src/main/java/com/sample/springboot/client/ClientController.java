package com.sample.springboot.client;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/clients/")
public class ClientController {

    private final ClientService clientService;

    @GetMapping
    public List<Client> getClients() {
        return clientService.getAllClients();
    }
}
