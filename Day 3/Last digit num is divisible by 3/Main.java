import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 126;
        int last = n % 10;
        if(last % 3 == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println("Not Divisible");
        }
    }
}

       