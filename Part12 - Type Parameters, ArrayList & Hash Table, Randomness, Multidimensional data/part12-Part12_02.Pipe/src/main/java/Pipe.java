import java.util.ArrayList;

public class Pipe <T> {

    private ArrayList<T> t;


    public Pipe() {
        this.t = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        t.add(value);
    }

    public T takeFromPipe() {
        if (t.isEmpty()) {
            return null;
        }
        T valueToRemove = t.get(0);
        t.remove(0);

        return valueToRemove;
    }

    public boolean isInPipe() {
        return !t.isEmpty();
    }
}
