package com.aziz.clients.service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.aziz.clients.entities.Commande;
import com.aziz.clients.entities.Client;
import com.aziz.clients.repos.CommandeRepository;
import com.aziz.clients.repos.ClientRepository;
@Service
public class ComServiceImpl implements ComService {
	@Autowired
	CommandeRepository CommandeRepository;

	@Override
	public List<Commande> findAll() {
		
		return CommandeRepository.findAll();
	}

	@Override
	public Commande saveCommande(Commande c) {
		return CommandeRepository.save(c);
	}

	@Override
	public Commande updateCommande(Commande c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCommande(Commande c) {
		CommandeRepository.delete(c);
	}

	@Override
	public void deleteCommandeById(Long id) {
		CommandeRepository.deleteById(id);
		
	}

	@Override
	public Commande getCommande(Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	
	


}
