package com.aziz.clients.entities;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.PastOrPresent;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@Entity
public class Commande {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idCom;
@Min(value = 10)
@Max(value = 10000)
private Double prixCom;

@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern = "yyyy-MM-dd")
@PastOrPresent
private Date dateCreation;


@JsonIgnore
@OneToMany(mappedBy = "commande")
private List<Client> clients;
public Commande() {}
public Commande(@Min(10) @Max(10000) Double prixCom, Date dateCreation, List<Client> clients) {
	super();
	this.prixCom = prixCom;
	this.dateCreation = dateCreation;
	this.clients = clients;
}


}	