import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
     //receive input from user and save it to a variable //named userGuess

      Scanner scan  = new Scanner(System.in);
      System.out.print("Whats your guess?");
      int userGuess = scan.nextInt();

     int correctNumber = 8;
     if (userGuess == correctNumber)
     {
         System.out.println("You Win!");
     }
     else
     {
       while( userGuess != correctNumber)
       {
         System.out.println("Guess again");
         userGuess = scan.nextInt();
         //take in user input and save it to the pre-declared variable named userGuess
         if (userGuess == correctNumber)
         { 
           System.out.println("You Win!");
        } else {
          System.out.println("wrong guess ");
        }
        
       }
     }
   }
}
