package tn.esprit.tpfoyer.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Client;
import tn.esprit.tpfoyer.repository.IClientRepository;
import tn.esprit.tpfoyer.service.interfaces.IClientService;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements IClientService {

    IClientRepository clientRepository;

    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

    public Client retrieveClient(Long clientId) {
        return clientRepository.findById(clientId).get();
    }

    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    public void removeClient(Long clientId) {
        clientRepository.deleteById(clientId);
    }

    public Client modifyClient(Client client) {
        return clientRepository.save(client);
    }
}