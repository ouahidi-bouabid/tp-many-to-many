package com.ouahidi.tpmanytomany.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Getter
@Setter
public class Client {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdClient;
    private String nom;
    // Une instance client est liée à plausieurs commandes
    // à travers l'attribut clients la classe Commande
    @ManyToMany(mappedBy = "clients", fetch = FetchType.EAGER)
    private List<Command> commandes = new ArrayList<>();

}
