package marta;

interface PatientRepository {
    boolean isPatientInQueue(Patient patient);

    void addPatientToQueue(Patient patient);
}
