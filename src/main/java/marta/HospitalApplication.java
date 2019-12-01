package marta;

import java.util.List;

public class HospitalApplication {

    private PatientRepository patientRepository;

    public HospitalApplication(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public void addPatientsToQueue(List<Patient> patients) {
        for (Patient patient : patients) {
            addPatientToQueue(patient);
        }
    }

    public void addPatientToQueue(Patient patient) {
        if (!patientRepository.isPatientInQueue(patient)) {
            patientRepository.addPatientToQueue(patient);
        } else {
            throw new IllegalArgumentException(patient.toString());
        }
    }
}
