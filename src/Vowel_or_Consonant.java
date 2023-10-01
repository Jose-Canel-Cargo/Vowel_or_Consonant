import java.util.Scanner;

public class Vowel_or_Consonant {
  
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String userInput = input.next();
        
        String userInputLowerCase = userInput.toLowerCase();
        char userInputToCharacter = userInputLowerCase.charAt(0);

        if (userInputToCharacter >= 'a' && userInputToCharacter <= 'z')
            
            switch(userInputToCharacter){
                case 'a':
                System.out.println("\nYour letter is a vowel");
                break;

                case 'e':
                System.out.println("\nYour letter is a vowel");
                break;

                case 'i':
                System.out.println("\nYour letter is a vowel");
                break;

                case 'o':
                System.out.println("\nYour letter is a vowel");
                break;

                case 'u':
                System.out.println("\nYour letter is a vowel");
                break;

                default:
                System.out.println("\nYour letter is a consonant");
            }
            
        else
            System.out.println("\nInvalid input");

        input.close();
    }
 }









        
    
    
