package marta;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HospitalApplicationTest {

    @Mock
    private PatientRepository repo;

    @Test
    public void addPatientToQueue() {
        //PatientRepository repo= mock(PatientRepository.class);
        //Given
        HospitalApplication app= new HospitalApplication(repo);
        when(repo.isPatientInQueue(any(Patient.class))).thenReturn(true);


        //When
        app.addPatientToQueue(new Patient("342345", "Kasia"));

        //Then
        verify(repo).addPatientToQueue(any(Patient.class));
    }
}