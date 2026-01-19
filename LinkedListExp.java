import java.util.LinkedList;

public class LinkedListExp {
    public static void main(String[] args){
        LinkedList<String> l = new LinkedList<>();

        l.add("hero");
        l.add("honda");
        l.add("yamaha");
        System.out.println("initial linked list: ");
        for(String s : l){
            System.out.println(s);
        }

        l.remove("hero");
        System.out.println("after removing hero: ");
        for(String s : l){
            System.out.println(s);
        }

        l.addFirst("suzuki");
        System.out.println("after adding suzuki at first: ");
        for(String s : l){
            System.out.println(s);
        }
    }
}