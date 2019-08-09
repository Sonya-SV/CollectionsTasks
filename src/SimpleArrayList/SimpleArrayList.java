package SimpleArrayList;

import java.util.Iterator;

public class SimpleArrayList<E> implements ArrayOperation<E> {

    private E [] array;
    SimpleArrayList(){
        array = (E[]) new Object[0];
    }
    @Override
    public boolean add(E value) {
        try {
            E[] temp = array;
            array = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, array, 0, temp.length);
            array[array.length - 1] = value;
            return true;
        }catch(ClassCastException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void remove(int index) {
      /*  try {
            E[] temp = array;
            array = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, array, 0, index);
            System.arraycopy(temp, index + 1, array, index, temp.length - index - 1);
        }catch (ClassCastException e){
            e.printStackTrace();
        }*/
      try {
          throw new Exception();
      }catch (Exception e){
          System.err.println("Can't remove");
      }

    }

    @Override
    public E get(int index) {
        return array[index];
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public void set(int index, E value) {
        array[index] =value;
    }


    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(array);
    }
}
