package zks1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassToBeTestedTest {

    ClassToBeTested classToBeTested = new ClassToBeTested();

    @Test
    public void testGimmeHahaReturnsHaha() {
        String expectedResult = "haha";
        String actualResult = classToBeTested.gimmeHaha();
        assertEquals(expectedResult, actualResult);

    }
}