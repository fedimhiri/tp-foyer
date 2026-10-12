package tn.esprit.tpfoyer.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Paiement;
import tn.esprit.tpfoyer.repository.IPaiementRepository;
import tn.esprit.tpfoyer.service.interfaces.IPaiementService;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiementServiceImpl implements IPaiementService {

    IPaiementRepository paiementRepository;

    public List<Paiement> retrieveAllPaiements() {
        return paiementRepository.findAll();
    }

    public Paiement retrievePaiement(Long paiementId) {
        return paiementRepository.findById(paiementId).get();
    }

    public Paiement addPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    public void removePaiement(Long paiementId) {
        paiementRepository.deleteById(paiementId);
    }

    public Paiement modifyPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }
}