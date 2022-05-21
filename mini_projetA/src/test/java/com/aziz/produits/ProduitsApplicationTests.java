package com.aziz.produits;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.aziz.clients.entities.Commande;
import com.aziz.clients.entities.Client;
import com.aziz.clients.repos.ClientRepository;
import com.aziz.clients.service.ClService;
@SpringBootTest
class ProduitsApplicationTests {
@Autowired
private ClientRepository clientRepository;

@Autowired
private ClService produitService;

@Test
public void testCreateProduit() {
Client prod = new Client();
clientRepository.save(prod);
}
@Test
public void testFindProduit()
{
Client p = clientRepository.findById(1L).get(); 
System.out.println(p);
}
@Test
public void testUpdateProduit()
{
Client p = clientRepository.findById(1L).get();

clientRepository.save(p);
}
@Test
public void testDeleteProduit()
{
clientRepository.deleteById(1L);;
}
 
@Test
public void testListerTousProduits()
{
List<Client> prods = clientRepository.findAll();
for (Client p : prods)
{
System.out.println(p);
}
}
@Test
public void testFindByNomProduitContains()
{
Page<Client> prods = produitService.getAllClientParPage(0,2);
System.out.println(prods.getSize());
System.out.println(prods.getTotalElements());
System.out.println(prods.getTotalPages());
prods.getContent().forEach(p -> {System.out.println(p.toString());
 });
/*ou bien
for (Client p : prods.getContent()
{
System.out.println(p);
} */
}
@Test
public void testFindByNomProduit()
{

}


}
