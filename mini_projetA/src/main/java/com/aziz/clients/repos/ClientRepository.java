package com.aziz.clients.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aziz.clients.entities.Commande;
import com.aziz.clients.entities.Client;
@RepositoryRestResource(path = "rest")
public interface ClientRepository extends JpaRepository<Client, Long> {
/*List<Client> findByNomClient(String nom);
	 List<Client> findByNomClientContains(String nom);
	 @Query("select p from Client p where p.nomProduit like %:nom and p.prixProduit > :prix")
	 List<Client> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
	 @Query("select p from Client p where p.categorie = ?1")
	 List<Client> findByCommande (Commande com);
	 List<Client> findByCommandeIdCom(Long id);
	 List<Client> findByOrderByNomProduitAsc();
	 @Query("select p from Client p order by p.nomProduit ASC, p.prixProduit DESC")
	 List<Client> trierProduitsNomsPrix();*/
}