package za.ac.cput.domain;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class DepartmentTest {

    private Department department1;
    private Department department2;
    private Department department3;

    @BeforeEach
    void setUp() {


    department1 =new Department("123","IT department","Dr Johnson","Eradicating the digital divide");
    department2 =new Department("123","IT department","Dr Johnson","Eradicating the digital divide");
    department3 =department2;


}
    @Test
    void EqualityTest(){
        assertEquals(department2, department3);
        System.out.println("Test passed, objects are equal");
    }
    @Test
    void IdentityTest(){
        assertNotSame(department1, department2);
        System.out.println("Test passed, objects are not the same");
    }
    @Test
    @Disabled
    void disabledTest(){
        assertSame(department1, department2);
        System.out.println("Test failed");
    }
    @Test
    void failingTest(){
    if(!department1.equals(department2)) {
        System.out.println("Test has been failed");
        fail("Test failed");

    }
    }
    @Test
    @Timeout(value = 2, unit = TimeUnit.MILLISECONDS)
    void timeoutTest()  {

        department1 = new Department();
        department1.setDepCode("5234");
        System.out.println(department1.getDepCode());
    }
}
