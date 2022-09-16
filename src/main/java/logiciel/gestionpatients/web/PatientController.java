package logiciel.gestionpatients.web;

import logiciel.gestionpatients.entities.Patients;
import logiciel.gestionpatients.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
  private PatientRepository patientRepository;
  @GetMapping(path = "/index")
  public String patients(Model model){
      List<Patients> patients=patientRepository.findAll();
      model.addAttribute("listPatients",patients);
    return  "patients";
  }
}
