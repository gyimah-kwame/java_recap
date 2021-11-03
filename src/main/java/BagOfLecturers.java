import java.util.ArrayList;
import java.util.List;

public class BagOfLecturers {

    private List<Lecturer> lecturers;

    public BagOfLecturers() {
        lecturers = new ArrayList<>();
    }

    public void add(Lecturer Lecture) {
        lecturers.add(Lecture);
    }

    public void remove(Lecturer Lecture) {
        lecturers.remove(Lecture);
    }

    public void clear() {
        lecturers.clear();
    }
}
