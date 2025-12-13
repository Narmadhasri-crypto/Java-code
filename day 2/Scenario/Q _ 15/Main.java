import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n2000 = 1;
        int n500 = 3;
        int n100 = 2;
        int total = (2000 * n2000)+(500 * n500)+(100 * n100);
        System.out.println(total);
    }
}