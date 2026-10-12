package tn.esprit.tpfoyer.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Agence;
import tn.esprit.tpfoyer.repository.IAgenceRepository;
import tn.esprit.tpfoyer.service.interfaces.IAgenceService;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceServiceImpl implements IAgenceService {

    IAgenceRepository agenceRepository;

    public List<Agence> retrieveAllAgences() {
        return agenceRepository.findAll();
    }

    public Agence retrieveAgence(Long agenceId) {
        return agenceRepository.findById(agenceId).get();
    }

    public Agence addAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    public void removeAgence(Long agenceId) {
        agenceRepository.deleteById(agenceId);
    }

    public Agence modifyAgence(Agence agence) {
        return agenceRepository.save(agence);
    }
}