import java.util.Scanner;
public class QuadraticFactors
{
    static double a,b,c,d;
    public static void takeinput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = sc.nextDouble();

        System.out.print("Enter the value of b: ");
        b = sc.nextDouble();

        System.out.print("Enter the value of c: ");
        c = sc.nextDouble();
    }

    public static void checkA(double number)
    {
        if(number == 0)
        {
            System.out.println("The value of a cannot be negative. Try with a new equation\n\n");
            takeinput();
        }
        else
        {
            checkDiscremenant();
        }
    }

    public static boolean checkDiscremenant() 
    {
        //descriminant is the value under the sqrt: b^2 - 4ac
        //we calculate the value now
        d = (Math.pow(b,2) - (4*a*c));
        boolean valid = d < 0 ? false : true;
        return valid;
    }

    public static void calculateRoots(boolean check)
    {
        if(check == true)
        {
            double x1,x2;
            x1 = (-b + Math.sqrt(d))/(2*a);
            x2 = (-b - Math.sqrt(d))/(2*a);

            if(x1 == x2)
            {
                System.out.printf("There is only one root for this equation which is: %.2f", x1);
            }
            else
            {
                System.out.printf("First factor is: %.2f \nSecond factor is: %.2f", x1,x2);
            }
        }
        else{
            System.out.println("Discriminant is negative, the roots are complex");
        }
    }

    public static void main(String... com1721)
    {
        takeinput();
        checkA(a);
        calculateRoots(checkDiscremenant());
    }
}