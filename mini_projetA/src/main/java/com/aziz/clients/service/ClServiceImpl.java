package com.aziz.clients.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.aziz.clients.entities.Commande;
import com.aziz.clients.entities.Client;
import com.aziz.clients.repos.ClientRepository;
@Service
public class ClServiceImpl implements ClService {
@Autowired
ClientRepository clientRepository;

@Override
public Client saveClient(Client p) {
	// TODO Auto-generated method stub
	return clientRepository.save(p);
}

@Override
public Client updateClient(Client p) {
	// TODO Auto-generated method stub
	return clientRepository.save(p);
}

@Override
public void deleteClient(Client p) {
	clientRepository.delete(p);
	
}

@Override
public void deleteClientById(Long id) {
	clientRepository.deleteById(id);
	
}

@Override
public Client getClient(Long id) {
	// TODO Auto-generated method stub
	return clientRepository.findById(id).get();
}

@Override
public List<Client> getAllClient() {
	return clientRepository.findAll();
}

@Override
public Page<Client> getAllClientParPage(int page, int size) {
	return clientRepository.findAll(PageRequest.of(page, size));
}

@Override
public List<Client> findByNomClient(String nom) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Client> findByNomClientContains(String nom) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Client> findByCommande(Commande commande) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Client> findByCommandeIdCom(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Client> findByOrderByNomCommandeAsc() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Client> trierCommandesNomsPrix() {
	// TODO Auto-generated method stub
	return null;
}

	
	
	
}