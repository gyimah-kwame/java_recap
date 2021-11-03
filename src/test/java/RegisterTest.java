import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void getHighestGrade() {

        Register register = new Register(List.of(
                new Student(List.of(10.0,20.0,30.0), "kwame"),
                new Student(List.of(40.0,50.0,60.0), "Alex")
        ));

        Assertions.assertEquals(60.0, register.getHighestGrade());
    }

    @Test
    public void testGetGradeStream() {
        Student student =  new Student(List.of(10.0,20.0,30.0), "kwame");
        System.out.println(student.getGradeStream());
    }

    @Test
    void getStudentsByName() {

        Register register = new Register(List.of(
                new Student(List.of(10.0,20.0,30.0), "kwame"),
                new Student(List.of(40.0,50.0,60.0), "Alex"),
                new Student(List.of(40.0,50.0,60.0), "smith")
        ));

        Optional<? extends Student> student = register.getStudentByName("kwame");

        System.out.println(register.getStudentsByName(List.of("kwame", "alex")));

        System.out.println(student.orElse(null));

    }
}