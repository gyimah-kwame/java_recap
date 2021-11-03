import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Register {

    private List<? extends Student> nameables;

    public Register(List<? extends Student> nameables) {
        this.nameables = nameables;
    }

    public List<String> getRegister() {

        return nameables.stream()
                .map(Student::getName)
                .collect(Collectors.toList());


    }

    public double getHighestGrade() {

        return nameables.stream()
                .map(Student::getGrades)
                .flatMap(Collection::stream)
                .max(Double::compareTo)
                .get();

    }

    public Optional<? extends Student> getStudentByName(String name){

        return nameables.stream()
                .filter(s -> name.equalsIgnoreCase(s.getName()))
                .findFirst();

    }

    public List<? extends Student> getStudentsByName(List<String> names) {

        return nameables.stream()
                .filter(names::contains)
                .collect(Collectors.toList());

    }

}
