import java.util.ArrayList;
import java.util.List;

public class Lecturer {

    private List<Student> students;

    public Lecturer() {
        this.students = new ArrayList<>();
    }

    public void enter(Student student) {
        students.add(student);
    }

    public double getHighestAverageGrade() {

        return students.stream()
                .map(Student::getAverageGrade)
                .max(Double::compareTo)
                .get();

    }
}
