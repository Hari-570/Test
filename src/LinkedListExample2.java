import java.util.LinkedList;
public class LinkedListExample2 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList();
        l.add(570);
        l.add(594);
        l.add(569);
        System.out.println(l);
        for(Integer i : l) ;
        {
            System.out.println(l);
        }
    }
}