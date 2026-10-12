package tn.esprit.tpfoyer.service.interfaces;

import tn.esprit.tpfoyer.entities.Agence;
import java.util.List;

public interface IAgenceService {

    List<Agence> retrieveAllAgences();

    Agence retrieveAgence(Long agenceId);

    Agence addAgence(Agence agence);

    void removeAgence(Long agenceId);

    Agence modifyAgence(Agence agence);
}