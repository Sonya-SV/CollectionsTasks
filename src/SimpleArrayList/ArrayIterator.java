package SimpleArrayList;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {

    private int index =  0;
    E[] array;
   ArrayIterator(E[] array){
        this.array=array;
   }
    @Override
    public boolean hasNext() {

       return index<array.length;
    }

    @Override
    public E next() {
       return array[index++];
    }
}
