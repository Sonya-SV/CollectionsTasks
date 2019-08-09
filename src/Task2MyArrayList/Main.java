package Task2MyArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new MyArrayList<String>();
        ArrayList<String> out = new MyArrayList<String>();
        System.out.println(strings.add("hello "));
        System.out.println(strings.add("world " ));
        System.out.println(strings.add("! "));
        strings.remove(2);
        System.out.println(strings.get(1));
        System.out.println(strings.size());
        strings.set(1, "java");
        System.out.println(strings.get(1));
        strings.retainAll(out);
        strings.remove("java");
        System.out.println(strings.size());

        for(String s: strings){
            System.out.print(s+ " ");
        }

    }
}
