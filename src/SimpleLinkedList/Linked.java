package SimpleLinkedList;

public interface Linked<E> {
    void addLast(E e);
    void addFirst(E e);
    int size();
    E getElemByIndex(int index);
}
