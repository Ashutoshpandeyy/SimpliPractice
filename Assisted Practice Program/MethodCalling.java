//Writing a program in Java to verify implementations of methods and ways of calling a method 

public class MethodCalling {
    public static void fact(int n){  // creating mathod
        int fact = 1;
        for(int i = 2; i<=n; i++){
            fact= fact*i;
        }
        System.out.println("Factoria of "+n+" is : " + fact);
    }
    public static void main(String[] args) {
        fact(5); // calling the method;
    }
}
