package logiciel.gestionpatients;

import logiciel.gestionpatients.entities.Patients;
import logiciel.gestionpatients.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class GestionpatientsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionpatientsApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(PatientRepository patientRepository){
		return args -> {
                 patientRepository.save(new Patients(null,"NANA YANGOY", new Date(),false,12));
			     patientRepository.save(new Patients(null,"MULUMBAKANDE ", new Date(),true,5));
			     patientRepository.save(new Patients(null,"KAPUKU MULUMA", new Date(),false,12));
				 patientRepository.findAll().forEach(p ->{
					 System.out.println(p.getNom());
				 } );
		};
	}

}
