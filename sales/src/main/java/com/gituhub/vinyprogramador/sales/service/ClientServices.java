package com.gituhub.vinyprogramador.sales.service;
import com.gituhub.vinyprogramador.sales.model.Client;

import com.gituhub.vinyprogramador.sales.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServices {

    private ClientRepository repository;
    @Autowired
    public ClientServices (ClientRepository repository){
        this.repository = repository;
    }
    private void saveClient(Client client){
        validateClient(client);
        //I call ClientsRepository because my business rule is in it, and now i save the client
        this.repository.save(client);
    }

    private void validateClient(Client client){
        //in this code i need take some validations
    }
}
