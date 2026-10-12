package tn.esprit.tpfoyer.service.interfaces;

import tn.esprit.tpfoyer.entities.Paiement;
import java.util.List;

public interface IPaiementService {

    List<Paiement> retrieveAllPaiements();

    Paiement retrievePaiement(Long paiementId);

    Paiement addPaiement(Paiement paiement);

    void removePaiement(Long paiementId);

    Paiement modifyPaiement(Paiement paiement);
}