package SimpleTreeSet;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public interface ITree<E> extends Iterable<E> {
    boolean add(E e);
    List<E> get();
    int size();
    SimpleTree.Leaf find(E e);
}
