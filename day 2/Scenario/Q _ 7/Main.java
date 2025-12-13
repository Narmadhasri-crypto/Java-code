import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int candies = 50;
        int students = 6;
        int Eachgets = candies / students;
        int Remaining = candies % students;
        System.out.println(Eachgets);
        System.out.println(Remaining);
    }
}
    
