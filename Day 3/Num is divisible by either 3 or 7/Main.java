import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 20;
        if(n % 3 == 0 || n % 7 == 0){
            System.out.println("The number is divisible by 3 or 7");
        } else {
            System.out.println("The number is Not divisible by 3 or 7");
        }
    }
}
        