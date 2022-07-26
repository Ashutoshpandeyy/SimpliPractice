import java.util.HashMap;

//Writing a program in Java to verify implementations of maps
public class MapUse {
    public static void main(String[] args) {
        String s = "Ashutosh";
        HashMap hp =  new HashMap<>();
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(hp.containsKey(c)){
                int n= 1;
                int o = n+1;
                hp.put(c, o);

            }else{
                hp.put(c, 1);
            }
        }

        System.out.println(hp);
            
        

    }
}
