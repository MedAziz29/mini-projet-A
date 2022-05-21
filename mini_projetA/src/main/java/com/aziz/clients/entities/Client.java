package com.aziz.clients.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;


@Entity
public class Client {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idClient;

@NotNull
@Size (min = 4,max = 25)
private String nomClient;


private String tel;



@ManyToOne
private Commande commande;
public Client() {
super();
}
public Client(String nomClient, String tel) {
super();
this.nomClient = nomClient;
this.tel = tel;

}
public Long getIdClient() {
	return idClient;
}
public void setIdClient(Long idClient) {
	this.idClient = idClient;
}
public String getNomClient() {
	return nomClient;
}
public void setNomClient(String nomClient) {
	this.nomClient = nomClient;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public Commande getCommande() {
	return commande;
}
public void setCom(Commande commande) {
	this.commande = commande;
}
@Override
public String toString() {
	return "Client [idClient=" + idClient + ", nomClient=" + nomClient + ", tel=" + tel + ", com=" + commande + "]";
}

}
