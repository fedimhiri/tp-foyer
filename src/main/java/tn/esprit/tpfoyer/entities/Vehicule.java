package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.tpfoyer.enums.CategorieVehicule;
import tn.esprit.tpfoyer.enums.StatutVehicule;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;

    private String immatriculation;
    private String marque;
    private String modele;

    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;

    private BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;

    @ManyToOne
    private Agence agence;

    @ManyToMany
    @Builder.Default
    private Set<Equipement> equipements = new HashSet<>();

    @OneToMany(mappedBy = "vehicule")
    @Builder.Default
    private Set<Reservation> reservations = new HashSet<>();

    @OneToMany(mappedBy = "vehicule")
    @Builder.Default
    private Set<Maintenance> maintenances = new HashSet<>();
}