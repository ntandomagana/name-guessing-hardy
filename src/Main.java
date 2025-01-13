import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        NameGuessingGame game = new NameGuessingGame();
        game.startGame();
    }
}

class NameGuessingGame {
    private final String[] names = {
            "Sino",
            "Ofentse",
            "Khetha",
            "Maboku",
            "Ntando",
            "Stanley",
            "Kamo",
            "Salome",
            "Ayanda",
            "Judas"
    };

    private final String nameToGuess;
    private int attempts = 3;

    public NameGuessingGame(){
        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        this.nameToGuess = names[randomIndex];
    }

    public void startGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a name from the following list: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println("You have " + attempts + " attempts to guess.");
        while(attempts > 0) {
            System.out.print("Guess the name: ");
            String guessedName = scanner.nextLine();
            attempts--;

            if (guessedName.equalsIgnoreCase(nameToGuess)) {
                System.out.println("Congratulations! You guessed the correct name: " + nameToGuess);
                break;
            } else {
                if (attempts > 0) {
                    System.out.println("Please try again. You have " + attempts + " attempts remaining");
                } else {
                    System.out.println("Game over");
                }
            }
        }

            scanner.close();


    }
}




