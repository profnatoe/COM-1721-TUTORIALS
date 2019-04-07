import java.util.Scanner;
public class Leap
{
    static int year;

    static Scanner sc = new Scanner(System.in);

    private static int inputYear()
    {
        System.out.print("Enter your four numeric input: ");
        year = sc.nextInt();
        return year;
    }
    private static boolean isYear(){

        if(year >=1995 && year <=2001)
        {
            return true;
        }
        else{
            return false;
        }
    }

    private static boolean isLeap(int year)
    {
       return  (year % 100 != 0 && year % 4 == 0 ) || (year % 400 == 0) ? true : false;
    }

    private static void displayIt(boolean leap)
    {
        if(leap == true )
        {
            System.out.printf("The year %d is a leap year", year);
        }
        else{
            System.out.printf("The year %d is not a leap year", year);
        }
    }
    public static void main(String... com1721)
    {
        displayIt(isLeap(inputYear()));
    }
}
