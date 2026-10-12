package tn.esprit.tpfoyer.service.interfaces;

import tn.esprit.tpfoyer.entities.Contrat;
import java.util.List;

public interface IContratService {

    List<Contrat> retrieveAllContrats();

    Contrat retrieveContrat(Long contratId);

    Contrat addContrat(Contrat contrat);

    void removeContrat(Long contratId);

    Contrat modifyContrat(Contrat contrat);
}