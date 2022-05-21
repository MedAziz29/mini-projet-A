package com.aziz.clients.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.aziz.clients.entities.Commande;
import com.aziz.clients.entities.Client;
public interface ClService {
Client saveClient(Client p);
Client updateClient(Client p);
void deleteClient(Client p);
 void deleteClientById(Long id);
Client getClient(Long id);
List<Client> getAllClient();
Page<Client> getAllClientParPage(int page, int size);
List<Client> findByNomClient(String nom);
List<Client> findByNomClientContains(String nom);

List<Client> findByCommande(Commande commande);
List<Client> findByCommandeIdCom(Long id);
List<Client> findByOrderByNomCommandeAsc();
List<Client> trierCommandesNomsPrix();

}