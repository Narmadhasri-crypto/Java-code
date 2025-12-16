import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = 2024;
        int month = 2;
        int days = 0;
        if(month < 1 || month > 12){
            System.out.println("Invalid month");
        } else if(month ==1||month ==3||month ==5||month ==7||month ==8||month ==10||month ==12){
            days = 31;
        } else if(month ==4||month ==6||month ==9||month ==11){
            days = 30;
        } else if(month == 2){
            days = 29;
        } else {
            days = 28;
        } else if (month == 4||month ==6||month ==9||month ==11){
            days = 30;
        } else {
            days = 31;
            System.out.println("days");
        }
    }
}