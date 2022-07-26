import java.util.Scanner;
public class Calculator {
    Scanner scn = new Scanner(System.in);
    void sum(){
        System.out.println("Enter the number ");
        int k= scn.nextInt();
        int j = scn.nextInt();
        int sm = k+j;
        System.out.println("sum is : " + sm);

    }

    void sub(){
        System.out.println("Enter the number ");
        int k= scn.nextInt();
        int j = scn.nextInt();
        int sb = k-j;
        System.out.println("subtraction is : " + sb);
    }

    void mul(){
        System.out.println("Enter the number ");
        int k= scn.nextInt();
        int j = scn.nextInt();
        int ml = k*j;
        System.out.println("sum is : " + ml);
    }

    void Division(){
        System.out.println("Enter the number ");
        int k= scn.nextInt();
        int j = scn.nextInt();
        int dv = k/j;
        System.out.println("sum is : " + dv);
    }
    
    void modulus(){
        System.out.println("Enter the number ");
        int k= scn.nextInt();
        int j = scn.nextInt();
        int mod = k%j;
        System.out.println("sum is : " + mod);
    }
    public static void main(String[] args) {

        Calculator clc = new Calculator();
        System.out.println("------Calculator -----------\n");
        System.out.println("1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5. Modulus\n 6. Exit");
        Scanner scn = new Scanner(System.in);
        
        
        while(true){
            System.out.print("Enter the option : ");
            int n = scn.nextInt();
            if(n==1){
                clc.sum();
            }else if(n==2){
                clc.sub();
            }else if(n==3){
                clc.mul();
            }else if(n==4){
                clc.Division();
            }else if(n==5){
                clc.modulus();
            }else if(n==6){
                System.exit(0);
            }else{
                System.out.println("Please Enter the valid Options");
            }
            
        }
        
        
    }
}
