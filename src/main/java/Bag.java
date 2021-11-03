import java.util.ArrayList;
import java.util.List;

public class Bag <T>{

    private List<T> bags;

    public Bag() {
        bags = new ArrayList<>();
    }

    public void add(T item) {
        bags.add(item);
    }

    public void remove(T item) {
        bags.remove(item);
    }

    public void clear() {
        bags.clear();
    }
}
