import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int price = 1000;
        int discount = 10;
        int discountAmount = (price * discount)/100;
        int finalPrice = price - discountAmount;
        System.out.println("Final Price= " + finalPrice);
    }
}