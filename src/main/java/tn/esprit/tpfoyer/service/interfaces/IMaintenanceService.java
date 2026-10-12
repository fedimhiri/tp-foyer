package tn.esprit.tpfoyer.service.interfaces;

import tn.esprit.tpfoyer.entities.Maintenance;
import java.util.List;

public interface IMaintenanceService {

    List<Maintenance> retrieveAllMaintenances();

    Maintenance retrieveMaintenance(Long maintenanceId);

    Maintenance addMaintenance(Maintenance maintenance);

    void removeMaintenance(Long maintenanceId);

    Maintenance modifyMaintenance(Maintenance maintenance);
}