// import Outer.Inner;

//Writing a program in Java to verify the implementation of inner classes
class Outer{
    int a;
    public void dis(){
        System.out.println("I am method or outer class");
    }
    class Inner{ // creating inner class
       public void evnOd(int n){
            if(n%2 == 0){
                System.out.println("Even Number");
            }else{
                System.out.println("Odd Number");
            }
        }
    }
}


public class InnerClass {
   public static void main(String[] args) {
        Outer obj1 =  new Outer(); // create outer class object
        obj1.dis();
        Outer.Inner obj2 = obj1.new Inner(); // Inner clas objecct
        obj2.evnOd(5);
   }
}
