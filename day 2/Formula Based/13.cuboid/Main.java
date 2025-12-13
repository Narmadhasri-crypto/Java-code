import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int l = 5;
        int b = 3;
        int h = 4;
        int surfacearea = 2*(l*b+b*h+h*l);
        int volume = l*b*h;
        System.out.println(surfacearea);
        System.out.println(volume);
    }
}