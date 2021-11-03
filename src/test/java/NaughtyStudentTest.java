


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class NaughtyStudentTest {

    @Test
    public void testNaughtyStudentAverage() {
        NaughtStudent naughtStudent = new NaughtStudent(List.of(10.0, 20.0, 30.0), "Naughty student");
        Assertions.assertEquals(22.0, naughtStudent.getAverageGrade(), 0);
    }

    @Test
    public void testNaughtyStudentIsAStudent() {
        NaughtStudent naughtStudent = new NaughtStudent(List.of(20.0, 20.0, 30.0), "Naughty student 1");

    }


}
