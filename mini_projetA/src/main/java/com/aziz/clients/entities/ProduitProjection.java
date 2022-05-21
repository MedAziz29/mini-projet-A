package com.aziz.clients.entities;

import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomClient", types = { Client.class })
public interface ProduitProjection {
public String getNomClient();
}