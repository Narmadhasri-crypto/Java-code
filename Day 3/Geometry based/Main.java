import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = 2;
        int y = -4;
        if(x > 0 && y > 0){
            System.out.println("first Quadrant");
        } else if(x < 0 && y > 0){
            System.out.println("second Ouadrant");
        } else if(x < 0 && y < 0){
            System.out.println("third Quadrant");
        } else if(x > 0 && y < 0){
            System.out.println("fourth Ouadrant");
        } else {
            System.out.println("Orgin");
        }
    }
}