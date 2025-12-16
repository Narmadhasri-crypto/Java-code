import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 10;
        if(n % 2 == 0 && n % 5 == 0 && n % 8 != 0){
            System.out.println("The number is divisible by both 2 and 5");
        } else {
            System.out.println("The number is not divisible by 8");
        }
    }
}
        