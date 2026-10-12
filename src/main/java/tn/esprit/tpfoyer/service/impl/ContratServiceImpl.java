package tn.esprit.tpfoyer.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Contrat;
import tn.esprit.tpfoyer.repository.IContratRepository;
import tn.esprit.tpfoyer.service.interfaces.IContratService;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratServiceImpl implements IContratService {

    IContratRepository contratRepository;

    public List<Contrat> retrieveAllContrats() {
        return contratRepository.findAll();
    }

    public Contrat retrieveContrat(Long contratId) {
        return contratRepository.findById(contratId).get();
    }

    public Contrat addContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    public void removeContrat(Long contratId) {
        contratRepository.deleteById(contratId);
    }

    public Contrat modifyContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }
}