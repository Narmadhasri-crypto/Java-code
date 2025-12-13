import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int price = 20;
        int mangoes = 13;
        int amount = 300;
        int total= price * mangoes;
        System.out.println("Total= " + total);
        if(amount>=total){
            System.out.println("Enough Money");
        }else{
            System.out.println("Not Enough Money");
        }
    }
}
        