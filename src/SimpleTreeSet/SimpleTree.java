package SimpleTreeSet;

import java.rmi.dgc.Lease;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SimpleTree<E> implements ITree<E>{
    private Leaf<E> root;
    private List<E> list;
    private int size=0;

    public SimpleTree() {
        list = new LinkedList<>();
        root = new Leaf<>(null);
    }

    @Override
    public boolean add(E e) {
        if(size==0)
            return initRootLeaf(e);
        Leaf<E> newNode = new Leaf<>(e);
        Leaf<E> lastNode = findLastElement(root, newNode);
        if(lastNode == null)
            return false;
        size++;
        newNode.parent = lastNode;
        if(lastNode.compareTo(newNode)<0) {
            lastNode.right = newNode;
            return true;
        }else{
            lastNode.left = newNode;
            return true;
        }
    }

    @Override
    public List<E> get() {
        for(E e: this)
            list.add(e);
        return list;
    }

    @Override
    public int size() {
        return size;
    }

    private Leaf<E> search(Leaf<E> current, Leaf<E> newLeaf){
        int compare = current.compareTo(newLeaf);

        if(compare> 0 && current.left != null)
            return search(current.left, newLeaf);
        if(compare< 0 && current.right != null)
            return search(current.right, newLeaf);
        if (compare == 0) {
            return current;
        }
        return null;
    }
    @Override
    public Leaf find(E e) {
        Leaf<E> needElem = new Leaf<>(e);
        return  search(root, needElem);
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter = 0;
            Iterator<Leaf<E>> iterator;
                    //= new TreeIterator<>(root);

             @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public E next() {
                return iterator.next().element;
            }
        };
    }

    private boolean initRootLeaf(final E e){
        root.element=e;
        size++;
        return true;
    }

    private Leaf<E> findLastElement(final Leaf<E> oldLeaf, final Leaf<E> newLeaf){
        Leaf<E> lastLeaf = oldLeaf;
        int compare = oldLeaf.compareTo(newLeaf);
        if(compare <0 && oldLeaf.right!=null){
            lastLeaf = findLastElement(oldLeaf.right, newLeaf);
            return lastLeaf;
        }
        if(compare >0 && oldLeaf.left!=null){
            lastLeaf = findLastElement(oldLeaf.left, newLeaf);
            return lastLeaf;
        }
        if(compare==0)
            return null;
        return lastLeaf;
    }

    class Leaf<E> implements Comparable<E> {

        private Leaf<E> parent;
        private Leaf<E> right;
        private Leaf<E> left;
        private E element;

        private Leaf(E element) {
            this.element = element;
        }

        public E getElement() {
            return element;
        }

        @Override
        public int compareTo(Object e) {
            Leaf<E> node = (Leaf<E>) e;
            return this.hashCode() - node.hashCode();
        }

        @Override
        public int hashCode() {
            return 31 * element.hashCode();
        }
    }
}
