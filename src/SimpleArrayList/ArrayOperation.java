package SimpleArrayList;

public interface ArrayOperation<E>  extends Iterable<E> {
    boolean add (E value);
    void remove (int index);
    E get (int index);
    int size ();
    void set (int index, E value);


}
