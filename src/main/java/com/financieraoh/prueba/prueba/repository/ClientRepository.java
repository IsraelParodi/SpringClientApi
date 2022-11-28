package com.financieraoh.prueba.prueba.repository;

import com.financieraoh.prueba.prueba.models.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ClientRepository extends MongoRepository<Client, String> {
}
