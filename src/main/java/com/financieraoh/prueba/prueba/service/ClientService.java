package com.financieraoh.prueba.prueba.service;

//import com.financieraoh.prueba.prueba.models.Client;
//import com.financieraoh.prueba.prueba.repository.ClientRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;

import com.financieraoh.prueba.prueba.models.Client;
import com.financieraoh.prueba.prueba.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAll(){
        return clientRepository.findAll();
    }

    public void save(Client client) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(10, new SecureRandom());
        client.setPassword(bCryptPasswordEncoder.encode(client.getPassword()));
        client.setCreate_date(LocalDateTime.now());
        clientRepository.save(client);
    }

    public Client update(Client clientFound, Client clientUpdate) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(10, new SecureRandom());
        clientFound.setPassword(bCryptPasswordEncoder.encode(clientUpdate.getPassword()));
        clientFound.setName(clientUpdate.getName());
        clientFound.setLastname_father(clientUpdate.getLastname_father());
        clientFound.setLastname_mother(clientUpdate.getLastname_mother());
        clientFound.setDocument_number(clientUpdate.getDocument_number());
        clientFound.setGender(clientUpdate.getGender());
        clientFound.setUpdate_date(LocalDateTime.now());
        clientRepository.save(clientFound);
        return clientFound;
    }

    public Optional<Client> findById(String id){
        return clientRepository.findById(id);
    }

//    public void findByDocumentNumber(Auth auth){
//        clientRepository.findClientsByDocument_number(auth.getDocument_number());
//    }

    public void deleteById(String id){
        clientRepository.deleteById(id);
    }
}
