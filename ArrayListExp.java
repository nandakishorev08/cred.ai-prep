import java.util.ArrayList;
public class ArrayListExp{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("scrampler");
        list.add("rc390");
        list.add("ninja250");
        list.add("duke200");
        
        // Displaying the ArrayList
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        //removing elemtents from arraylist
        list.remove("duke200");
        System.out.println("After removing duke200:");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }   
        
    }
}