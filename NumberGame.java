
import java.util.Random;
import java.util.Scanner;
public class NumberGame
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempt = 10;
        int totalRounds = 0;
        int score = 0;
        System.out.println("/n******** WELCOME TO THE NUMBER GAME ********");
        boolean playAgain = true;
        while(playAgain)
        {
            int generatedNumber = random.nextInt(maxRange - minRange + 1)+ minRange;
            int attempts = 0;
            boolean guessedCorrectly = false;
            System.out.println("\nRound: "+ (totalRounds +1));
            System.out.println("\nSystem has generated a number between "+ minRange +"and "+ maxRange +".");
        System.out.println("you have "+ maxAttempt +" attempts to guess the number. Good luck!");
        totalRounds++;
        while(attempts < maxAttempt && !guessedCorrectly)
        {
            System.out.println("\nAttempt: "+ (attempts +1) +"/" + maxAttempt);
            System.out.println("enter your guess => ");
            int userGuess = scanner.nextInt();
            scanner.nextLine();
            if(userGuess < generatedNumber)
            {
                System.out.println("\n It's too low!");
            }
            else if (userGuess > generatedNumber)
            {
                System.out.println("\nIt's too high!");
            }
            else 
            {
                System.out.println("Bullseye!! you guessed theright one.");
                guessedCorrectly = true;
                score++;
            }
            attempts++;
        }
        if (!guessedCorrectly)
        {
            System.out.println("\nOops! you have used up all yourattempts.");
            System.out.println("The coorect number was:" + generatedNumber);
        }
        System.out.println("\nWould you like to play this gameagain? (Yes/No) =>");
        String playAgainResponse= scanner.nextLine();
        if(!playAgainResponse.equalsIgnoreCase("Yes"))
        {
            playAgain = false;
        }
    
    }
    System.out.println("\nGame over! your score is:"+ score);
    System.out.println("Thanks for playing!");
}
    
}
