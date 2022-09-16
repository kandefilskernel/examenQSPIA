package logiciel.gestionpatients.repositories;

import logiciel.gestionpatients.entities.Patients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository <Patients,Long>{
}
