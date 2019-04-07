import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.random;

public class RandLotto
{
    private static int [] generated;
    private static int [] input;
    private static Scanner sc = new Scanner(System.in);

    private static void gen(){
       generated = new int[6];
        for(int i = 0; i < 6 ; i++){
            generated[i]= (int)(random() * 49 + 1);

            int[] check = generated;

            for(int x = 0 ; x< 6; x++){
                for(int y = 0; y<6; y++){
                    if(check[y] == generated[x]){
                        generated[x] += 1;
                    }
                }
            }
        }
    }

    private static int getInput()
    {
        int count = 0;
        int numbers = 1;


        input = new int[6];

        for(int i = 0; i< 6; i++){

            System.out.print("Enter value number " + numbers + ": ");
            input[i] = sc.nextInt();
            numbers += 1;
        }

        for(int x : input){
            for(int y : generated){
                if(x == y){
                    count += 1;
                    return count;
                }
            }
        }
        return count;
    }

    private static void printValues(int a){
        System.out.print("Computer Generated: " + Arrays.toString(generated));
        System.out.print("\nUser input Numbers: " +Arrays.toString(input)+"\n\n");
        if(a == 6){
            System.out.println("You have won R1m");
        }
        else if(a == 5){
            System.out.println("You have won R450000");
        }
        else if(a == 4){
            System.out.println("You have won R160000");
        }
        else if(a == 3)
        {
            System.out.println("You have won R1200");
        }
        else if(a == 2){
            System.out.println("Two matches, no win");
        }
        else if(a == 1)
        {
            System.out.println("One match, no win");
        }
        else{
            System.out.println("Sorry you didn't win, no match at all");
        }
    }
    public static void main(String... com1721)
    {
        gen();
        printValues(getInput());

    }
}
