import java.util.List;

public class NaughtStudent extends Student{


    public NaughtStudent(List<Double> grades, String name) {
        super(grades, name);
    }

    @Override
    public double getAverageGrade() {
        double grade =  super.getAverageGrade();
        return grade + (0.10 * grade);
    }
}
