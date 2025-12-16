import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 3;
        if(n <= 9){
            System.out.println("Single digit number");
        } else if(n <= 99){            
            System.out.println("Two digit number");
        } else if(n <= 999){
            System.out.println("Three digit number");
        }
    }
}