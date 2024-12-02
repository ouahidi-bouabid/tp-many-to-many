package com.ouahidi.tpmanytomany.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity

@NoArgsConstructor @AllArgsConstructor @ToString @Builder
@Getter @Setter
public class Command {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdCommand;
    private Long montant;
    //private String intitulee;
    @ManyToMany  (fetch = FetchType.EAGER) // Par défaut  (fetch = FetchType.EAGER)
/*
    @JoinTable (name="Command_Client_Jointure",
            joinColumns =  @JoinColumn (name="idCommand"),
            inverseJoinColumns = @JoinColumn (name="IdClient"))
*/
   // @ManyToMany(mappedBy = "commandes")

    private List<Client> clients= new ArrayList<>();




}
