package SimpleLinkedList;

import java.util.Iterator;

public class MyLinkedList<E> implements Linked<E>, Iterable<E> , DescendingIterator<E>{

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size =0;

    public MyLinkedList() {
        lastNode = new Node<>(null, firstNode, null);
        firstNode = new Node<>(null,null, lastNode);
    }

    @Override
    public void addLast(E e) {
        Node<E> prev = lastNode;
        prev.setCurrentElem(e);
        lastNode = new Node<>(null, prev, null );
        prev.setNextElem(lastNode);
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = firstNode;
        next.setCurrentElem(e);
        firstNode = new Node<>(null, null, next);
        next.setPrevElem(firstNode);
        size++;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElemByIndex(int index) {
        Node<E> target = firstNode.getNextElem();
        for(int i=0; i<index; i++)
            target =getNextElem(target);
        return target.getCurrentElem();
    }

    private Node<E> getNextElem(Node<E> current){
        return current.getNextElem();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter =0;
            @Override
            public boolean hasNext() {
                return counter <size;
            }

            @Override
            public E next() {
                return getElemByIndex(counter++);
            }
        };
    }

    @Override
    public Iterator<E> descendingIterator() {
        return new Iterator<E>() {
            int descCounter = size -1;
            @Override
            public boolean hasNext() {
                return descCounter>=0;
            }

            @Override
            public E next() {
                return getElemByIndex(descCounter--);
            }
        };
    }

    private static class Node<E>{

        E currentElem;
        Node<E> nextElem;
        Node<E> prevElem;

        public Node(E currentElem, Node<E> prevElem, Node<E> nextElem) {
            this.currentElem = currentElem;
            this.nextElem = nextElem;
            this.prevElem = prevElem;
        }

        public E getCurrentElem() {
            return currentElem;
        }

        public void setCurrentElem(E currentElem) {
            this.currentElem = currentElem;
        }

        public Node<E> getNextElem() {
            return nextElem;
        }

        public void setNextElem(Node<E> nextElem) {
            this.nextElem = nextElem;
        }

        public Node<E> getPrevElem() {
            return prevElem;
        }

        public void setPrevElem(Node<E> prevElem) {
            this.prevElem = prevElem;
        }
    }


}
