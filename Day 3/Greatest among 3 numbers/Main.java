import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 30;
        int c = 20;
        if(a > b && a > c) {
            System.out.println(a);
        } else if(b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
       