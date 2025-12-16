import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = -8;
        if(a * b > 0){
            System.out.println("Positive");
        } else if(a * b < 0){
            System.out.println("Negative");
        }
    }
}