package com.aziz.clients.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.aziz.clients.entities.Commande;

import com.aziz.clients.entities.Client;

public interface ComService {
 List<Commande> findAll () ;
		
 Commande saveCommande(Commande c);
 Commande updateCommande(Commande c);
 void deleteCommande(Commande c);
  void deleteCommandeById(Long id);
  Commande getCommande (Long idCat);
}
