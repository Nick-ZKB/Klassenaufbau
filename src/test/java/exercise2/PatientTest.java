package exercise2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {
    private Patient patient;

    @BeforeEach
    void setUp() {
        patient = new Patient("Dario", 16, "lion");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getAlter() {
    }

    @Test
    void setAlter() {
    }

    @Test
    void getGeschlecht() {
    }

    @Test
    void setGeschlecht() {
    }

    @Test
    void testToString() {
        String expected = "Dario is 16 years old and is a lion";
        assertEquals(expected, patient.toString());
    }
}