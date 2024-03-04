package com.challenge.cubo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.challenge.cubo.Dto.ClientDTO;
import com.challenge.cubo.entity.Client;
import com.challenge.cubo.repository.ClientRepository;

@Service
public class ClientService {

  private ClientRepository clientRepository;

  public ClientService(ClientRepository clientRepository) {
    this.clientRepository = clientRepository;
  }

  public Client saveClient(ClientDTO clientDto) {
    Client client = new Client();
    client.setFirstName(clientDto.firstName());
    client.setLastName(clientDto.lastName());
    client.setParticipacao(clientDto.participacao());

    return clientRepository.save(client);
  }

  public List<Client> listAllClients() {
    List<Client> allClients = clientRepository.findAll();
    return allClients;
  }

}
