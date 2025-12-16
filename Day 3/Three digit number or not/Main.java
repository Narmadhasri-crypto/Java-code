import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 125;
        if(n >= 100 && n <= 999){
            System.out.println("It is 3-digit number");
        } else {
            System.out.println("It is not 3-digit number");
        }
    }
}
        