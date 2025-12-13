import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.print("15");
            int num = sc.nextInt();
            String octal=Integer.toOctalString(num);
            System.out.println("Octal format:"+octal);
    }
}
        