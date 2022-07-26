import java.util.ArrayList;

//Writing a program in Java to verify implementations of collections
public class CollectionUse {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
        al.add("Ashu");
        al.add(":");
        al.add("How");
        System.out.println(al);
        System.out.println(al.size()); // find the size of arrayList
        System.out.println(al.isEmpty());// check list is empty or not 
        System.out.println(al.get(0)); // get the value 
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
        System.out.println();
        // foreach Loop
        for(Object i:al)
        {
            System.out.println(i);

        }
        
    }
}
