package com.challenge.cubo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.challenge.cubo.Dto.ClientDTO;
import com.challenge.cubo.entity.Client;
import com.challenge.cubo.service.ClientService;

@RequestMapping("/api/v1")
@Controller
public class ClientController {

  private ClientService clientService;

  public ClientController(ClientService clientService) {
    this.clientService = clientService;
  }

  @PostMapping("/client")
  public ResponseEntity<Client> saveClient(@RequestBody ClientDTO clientDto) {
    Client client = clientService.saveClient(clientDto);
    return ResponseEntity.ok().body(client);
  }

  @GetMapping("/clients")
  public ResponseEntity<List<Client>> listAllClients() {
    List<Client> clientList = clientService.listAllClients();
    return ResponseEntity.ok().body(clientList);
  }

}
