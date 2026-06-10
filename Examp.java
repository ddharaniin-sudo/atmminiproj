import java.util.ArrayList;
public class Examp {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list2.add(13);
        list2.add(13);
        list2.add(13);
        System.out.println("ArrayList: " + list);
        System.out.println("Integer ArrayList: " + list2);
    Collections.sort(list);
    System.out.println("Sorted ArrayList: " + list);
    


    }
}