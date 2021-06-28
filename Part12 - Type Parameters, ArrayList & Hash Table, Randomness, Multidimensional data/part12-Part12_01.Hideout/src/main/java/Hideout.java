public class Hideout<T> {

    private T t;

    public void putIntoHideout(T toHide) {
        if (t != null) {
            t = null;
        }
        t = toHide;
    }

    public T takeFromHideout() {
        if (isInHideout()) {
            T takenObject = t;
            t = null;
            return takenObject;
        }
        return t;
    }

    public boolean isInHideout() {
        return t != null;
    }

}
