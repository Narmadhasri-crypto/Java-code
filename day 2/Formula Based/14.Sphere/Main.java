import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double r = 7;
        double surfacearea = 4*3.14*r*r;
        double volume = 4/3.0*3.14*r*r*r;
        System.out.println(surfacearea);
        System.out.println(volume);
    }
}