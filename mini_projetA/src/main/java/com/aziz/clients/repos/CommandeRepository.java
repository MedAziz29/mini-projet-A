package com.aziz.clients.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aziz.clients.entities.Commande;
import com.aziz.clients.entities.Client;
@RepositoryRestResource(path = "rest")
public interface CommandeRepository extends JpaRepository<Commande, Long> {
	
}