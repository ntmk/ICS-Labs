using System;

namespace lab1_fizzbuzz
{
    class Program
    {
        static void Main(string[] args)
        {
            int num = 0;
            String text = "";
            for (num = 1; num <= 100; num++)
            {
                int div3 = num % 3;
                int div5 = num % 5;
                if (num == 100)
                {
                    if ((div3 == 0) && (div5 == 0))
                    {
                        text += "fizzBuzz";
                    }
                    else if (div3 == 0)
                    {
                        text += "fizz";
                    }
                    else if (div5 == 0)
                    {
                        text += "buzz";
                    }
                    else
                    {
                        text += num;
                    }
                    Console.WriteLine(text);
                    Console.ReadLine();
                }
                if ((div3 == 0) && (div5 == 0))
                {
                    text += "fizzBuzz, ";
                }
                else if (div3 == 0)
                {
                    text += "fizz, ";
                }
                else if (div5 == 0)
                {
                    text += "buzz, ";
                }
                else
                {
                    text += num + ", ";
                }

            }
        }
    }
}
