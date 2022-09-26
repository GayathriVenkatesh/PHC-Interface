package com.example.phcbackend;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.phcbackend.repository.FollowupRepository;
import com.example.phcbackend.repository.FollowupScheduleRepository;
import com.example.phcbackend.repository.PatientRepository;
import com.example.phcbackend.model.Followup;
import com.example.phcbackend.model.FollowupSchedule;
import com.example.phcbackend.model.Patient;

@SpringBootApplication
public class PhcBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhcBackendApplication.class, args);
	}

	
    @Bean
    CommandLineRunner init(PatientRepository patientRepository, FollowupRepository followupRepository, FollowupScheduleRepository followupScheduleRepository) {
        return args -> {
            // Stream.of("Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
            //     Users user = new Users(name, name.toLowerCase() + "@domain.com");
            //     System.out.println("OBJECT " + user);
            //     usersRepository.save(user);
            // });
            // usersRepository.findAll().forEach(System.out::println);

            for(int i=0; i<5; i++) {
                Patient patient = new Patient("124" + i, "943", "908906", "AB038", "9845154210", "Doddathoguru",
                -1, "Patient" + i, "12-09-2022");
                System.out.println("OBJECT " + patient);
                patientRepository.save(patient);
            };
            patientRepository.findAll().forEach(System.out::println);

            Followup f = new Followup("1", "1", "09-09-2018", "", true, 1.2,
            9.0, 5.3, -1);
            Followup g = new Followup("1", "1", "09-09-2018", "", false, 1.2,
            90.0, 7.3, -1);
            Followup h = new Followup("2", "1", "09-09-2018", "", true, 1.2,
            9.0, 5.3, -1);
            followupRepository.save(f);
            followupRepository.save(g);
            followupRepository.save(h);
            followupRepository.findAll().forEach(System.out::println);

            FollowupSchedule a = new FollowupSchedule(
				"123",
				"A1",
				LocalDate.of(2022, Month.SEPTEMBER, 22),
				"DONE"
			);

            FollowupSchedule b = new FollowupSchedule(
				"124",
				"A2",
				LocalDate.of(2022, Month.SEPTEMBER, 25),
				"DONE"
			);
            followupScheduleRepository.save(a);
            followupScheduleRepository.save(b);
            followupScheduleRepository.findAll().forEach(System.out::println);
        };
    }
}
