package SimpleArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayOperation<String> strings = new SimpleArrayList<String>();
        System.out.println(strings.add("hello"));
        System.out.println(strings.add("world"));
        System.out.println(strings.add("!"));
        System.out.println(strings.get(1));
        System.out.println(strings.size());
        strings.set(1, "java");
        System.out.println(strings.get(1));
        strings.remove(1);
        System.out.println(strings.size());

        for(String s: strings){
            System.out.print(s+ " ");
        }

    }
}
