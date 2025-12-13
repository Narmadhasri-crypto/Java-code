import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();
        double surfacearea = 2*3.14*(h+r);
        double volume = 3.14*r*r*h;
        System.out.println(surfacearea);
        System.out.println(volume);
    }
}