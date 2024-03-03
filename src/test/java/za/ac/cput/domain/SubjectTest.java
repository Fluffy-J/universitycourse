package za.ac.cput.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {
    Subject subject1;
    Subject subject2;
    Subject subject3;


    @Test
    void objectEquality() {
        subject1 = new Subject("adp3", "Application Development Practice", new ArrayList<Lecturer>(), "Application Dev Using Java", 10);
        subject2 = subject1;
        assertEquals(subject1, subject2);
    }

    @Test
    void objectIdentity() {
        subject1 = new Subject("adp3", "Application Development Practice", new ArrayList<Lecturer>(), "Application Dev Using Java", 10);
        subject2 = subject1;
        subject2.setSubjectCode("adp2");
        assertSame(subject1, subject2);

    }

    @Test
    void failingTest() {
        subject1 = new Subject();
        subject2 = subject1;
        if (subject1.equals(subject2)) {
            fail("object are equal");

        }

    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.MILLISECONDS)
    void timeoutTest()  {

        subject1 = new Subject();
        subject1.setSubjectCode("ITS2");

    }

    @Test
    @Disabled
    void disablingTest() {
        assertSame(subject3, subject2);


    }

}