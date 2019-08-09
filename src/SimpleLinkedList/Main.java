package SimpleLinkedList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> strings = new MyLinkedList<>();
        strings.addLast("3");
        strings.addLast("4");
        strings.addFirst("2");

        for(String s: strings)
            System.out.println(s);

//        System.out.println(strings.getElemByIndex(2));

        Iterator it = strings.descendingIterator();
        while(it.hasNext())
            System.out.println(it.next());

    }
}
