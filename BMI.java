import java.util.Scanner;

//This class is not complete, statements that are to be printed when bmi meets a certain condition are omitted

public class BMI
{
    static Scanner sc = new Scanner(System.in);
    static double h,w;

    private static void takeInput(){

        System.out.print("Input your weight: ");

        w = sc.nextDouble();
        h = sc.nextDouble();
    }

    private static double calculateBMI(){
        takeInput();
        return w/Math.pow(h,2);
    }

    private static void decide(double bmi){

        if(bmi < 16){
            System.out.println("");
        }

        else if(bmi > 16 && bmi < 18){
            System.out.println("");
        }

        else if(bmi > 18){
            System.out.println("");
        }
    }
    public static void main(String... com1721)
    {
        decide(calculateBMI());
    }
}
