import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("ASCII value(0-127):");
        int ascii = sc.nextInt();
        char ch = (char) ascii;
        System.out.println("Char for ASCII value"+ascii+"is:"+ch);
    }
}
