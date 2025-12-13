import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int P = 5000;
        int R = 5;
        int T = 2;
        int Interest = P * R * T / 100;
        System.out.println(Interest);
    }
}