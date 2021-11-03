import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Student {

    private List<Double> grades;
    private String name;

    public Student(List<Double> grades, String name) {
        this.grades = grades;
        this.name = name;
    }

    public double getAverageGrade() {
        double total = grades.stream().reduce(0.0, (a, b) -> a + b);
        return total / grades.size();
    }

    public List<Double> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stream<Double> getGradeStream() {
        return grades.stream();
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + grades +
                ", name='" + name + '\'' +
                '}';
    }
}
