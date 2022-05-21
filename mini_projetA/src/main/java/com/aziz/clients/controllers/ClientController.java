package com.aziz.clients.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aziz.clients.entities.Commande;
import com.aziz.clients.entities.Client;
import com.aziz.clients.service.ComService;
import com.aziz.clients.service.ClService;
@Controller
public class ClientController {
@Autowired
ClService CService;
@Autowired
ComService ComService;
@RequestMapping("/showCreate")
public String showCreate(ModelMap modelMap)
{
	List<Commande> cat= ComService.findAll();
	modelMap.addAttribute("commandes", cat);
modelMap.addAttribute("client", new Client());
modelMap.addAttribute("mode", "new");

return "formClient";
}
@RequestMapping("/saveClient")
public String saveClient(@Valid Client client,
BindingResult bindingResult)
{
	System.out.println(client);
if (bindingResult.hasErrors()) return "formClient";
 
CService.saveClient(client);
return  "redirect:/ListeClients";
}

@RequestMapping("/showCreateCom")
public String showCreateCat(ModelMap modelMap)
{
modelMap.addAttribute("commandes", new Commande());
modelMap.addAttribute("mode", "new");
return "formCommande";
}
@RequestMapping("/saveCommande")
public String saveCommandes(@ModelAttribute("comamandes")Commande commande,ModelMap modelMap) throws ParseException 
{
Commande saveCommande = ComService.saveCommande(commande);
return "redirect:/ListeCom";
}
@RequestMapping("/ListeClient")
public String listeProduits(ModelMap modelMap,
@RequestParam (name="page",defaultValue = "0") int page,
@RequestParam (name="size", defaultValue = "3") int size)
{
Page<Client> prods = CService.getAllClientParPage(page, size);
modelMap.addAttribute("clients", prods);
 modelMap.addAttribute("pages", new int[prods.getTotalPages()]);
modelMap.addAttribute("currentPage", page);
return "listeClients";
}
@RequestMapping("/ListeCom")
public String listeCommande(ModelMap modelMap)
{
List <Commande> cats = ComService.findAll();
modelMap.addAttribute("commandes", cats);
return "ListeCom";
}
@RequestMapping("/supprimerClient")
public String supprimerProduit(@RequestParam("id") Long id,
ModelMap modelMap,
@RequestParam (name="page",defaultValue = "0") int page,
@RequestParam (name="size", defaultValue = "3") int size)
{
CService.deleteClientById(id);
Page<Client> prods = CService.getAllClientParPage(page, 
size);
modelMap.addAttribute("clients", prods);
modelMap.addAttribute("pages", new int[prods.getTotalPages()]);
modelMap.addAttribute("currentPage", page);
modelMap.addAttribute("size", size);
return "listeClients";
}
@RequestMapping("/modifierClient")
public String editerProduit(@RequestParam("id") Long id,ModelMap modelMap)
{
	List<Commande> cat= ComService.findAll();
	modelMap.addAttribute("commandes", cat);
Client p= CService.getClient(id);
modelMap.addAttribute("client", p);
modelMap.addAttribute("mode", "edit");
return "formClient";
}
@RequestMapping("/updateClient")
public String updateProduit(@ModelAttribute("client") Client client,
@RequestParam("date") String date,ModelMap modelMap) throws ParseException {
	//conversion de la date 
	 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	 Date dateCreation = dateformat.parse(String.valueOf(date));

	 
	 CService.updateClient(client);
	 List<Client> prods = CService.getAllClient();
	 modelMap.addAttribute("clients", prods);
	return "listeClients";
	}
@RequestMapping("/supprimerCom")
public String supprimerCommande(@RequestParam("id") Long id,
 ModelMap modelMap)
{ 
ComService.deleteCommandeById(id);
List<Commande> cats = ComService.findAll();
modelMap.addAttribute("commandes", cats);
return "ListeCom";
}

}