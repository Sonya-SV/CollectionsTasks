package Task2MyArrayList;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class MyArrayList<E> extends ArrayList<E> {

    E[] array ;
    String message = "Can`t remove object from Task2MyArrayList";
    public MyArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public MyArrayList() {
    }

    public MyArrayList(Collection<? extends E> c) {
        super(c);
    }

    @Override
    public E remove(int index){
        System.err.println(message);
        return (E) this;
    }
    @Override
    public boolean remove(Object o){
        System.err.println(message);
        return false;
    }
    @Override
    public boolean removeAll(Collection<?> c){
        System.err.println(message);
        return false;
    }
    @Override
    public boolean removeIf(Predicate<? super E> filter)	{
        System.err.println(message);
        return false;
    }
    @Override
    protected void removeRange(int fromIndex, int toIndex){
        System.err.println(message);
    }
    @Override
    public void replaceAll(UnaryOperator<E> operator){
        System.err.println(message);
    }
    @Override
    public boolean retainAll(Collection<?> c){
        System.err.println(message);
        return false;
    }
}
