import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 218;
        int lastdigit = n / 10;
        if(lastdigit % 2 == 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
        