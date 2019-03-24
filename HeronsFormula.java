import java.util.Scanner;

public class HeronsFormula
{
    static Scanner sc = new Scanner(System.in);
    //the length cannot always be a whole number, and to cover 64-bit i chose double instead of float
    static double a, b, c, d;
    public static void takeinput(){

        System.out.print("Enter the value of a: ");
        
        a = sc.nextDouble();

        System.out.print("Enter the value of b: ");

        b = sc.nextDouble();

        System.out.print("Enter the value of c: ");

        c = sc.nextDouble(); 
    }

    public static double calculateHalfPerimeter()
    {
        return ((a+b+c)/2);
    }

    public static double calculateAreaOfTriangle(double p)
    {
        return (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }

    public static void main(String... com1721)
    {
        takeinput();
        System.out.printf("Half Perimeter is %.2f\nThe Area of the triangle is: %.2f",calculateHalfPerimeter(), 
                          calculateAreaOfTriangle(calculateHalfPerimeter()));
    }

    
}
