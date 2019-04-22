using System;

namespace dEMOSD
{
    public class Program
    {

        private static int a=0, b=0, c=0;
        private static double area;
        public static int TakeInput(string whichValue)
        {

            int value = 0;

            bool validUserInput = false;

            while (validUserInput == false)
            {
                try
                {
                    Console.Write($"Please enter the value of {whichValue}: ");
                    value = int.Parse(Console.ReadLine()); //try to parse the user input to an int variable
                }
                catch (Exception) { Console.WriteLine("Input is not a number"); } //catch exception for invalid input.

                if (value >= 1) //check to see that the user entered int >= 1
                {
                    validUserInput = true;
                }
                else
                {
                    Console.WriteLine("Input should be above or equal to 1");
                }

            }//end while

            return value;
        }

        public static double CalcPerimeter(bool valid)
        {


            if (valid)
            {
                Console.WriteLine("Input is valid, all sides form a valid triangle");

                return (a + b + c) / (2);

            }
            else
            {
                return 0;
            }
        }

        public static double calcArea(double p)
        {
            
            if(p != 0)
            {
              return Math.Sqrt(p * ((p - a) * (p - b) * (p - c)));
            }

            return 0;
        }
        public static bool CheckValid()
        {
            bool valid = false;

            if ((a + b > c) || (b + c > a) || (a + c > b))
            {
                return valid = true;
            }
            return valid;
        }

        static void Main(string[] args)
        {
            a = TakeInput("a");
            b = TakeInput("b");
            c = TakeInput("c");

            area = calcArea(CalcPerimeter(CheckValid()));

            Console.WriteLine($"The area of the triangle is {area}");
            Console.ReadKey();
        }
    }
}
