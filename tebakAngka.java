import java.util.Scanner;
import java.util.Random;
public class tebakAngka {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int guess, count = 1; boolean correct = false;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking a number between 1 and 100");
        System.out.println("Try to guess the correct number!");
        int number = r.nextInt(100)+1;
        System.out.println();
        System.out.println("1. Easy (10 chances)\n2. Medium (5 chances)\n3. Hard (3 chances)");
        System.out.print("Choose the difficulty : ");
        int diff = s.nextInt();
        switch(diff){
            case 1:System.out.println("Great, you selected the easy difficulty level");
                   System.out.println("Lets start the game!");
                  while (correct == false && count <= 10){
                    System.out.print("Enter your guess : ");
                    guess = s.nextInt();
                    if (guess<number){
                        System.out.println("Incorrect, the number is more than "+guess);
                        count++;
                    } else if(guess>number){
                        System.out.println("Incorrect, the number is less than "+guess);
                        count++;
                    } else if(guess==number){
                        System.out.println("Congratulations, you guessed the correct number in "+count+" attemps");
                    }
                    if (count > 10){
                        System.out.println("Sorry, you're out of attemps");
                        System.out.println("the correct number is "+number);
                    }
                  }
                break;
            case 2:System.out.println("Great, you selected the medium difficulty level");
                   System.out.println("Lets start the game!");
                  while (correct == false && count <= 5){
                    System.out.print("Enter your guess : ");
                    guess = s.nextInt();
                    if (guess<number){
                        System.out.println("Incorrect, the number is more than "+guess);
                        count++;
                    } else if(guess>number){
                        System.out.println("Incorrect, the number is less than "+guess);
                        count++;
                    } else if(guess==number){
                        System.out.println("Congratulations, you guessed the correct number in "+count+" attemps");
                    }
                    if (count > 5){
                        System.out.println("Sorry, you're out of attemps");
                        System.out.println("the correct number is "+number);
                    }
                  }
                break;
            case 3:System.out.println("Great, you selected the hard difficulty level");
                   System.out.println("Lets start the game!");
                  while (correct == false && count <= 3){
                    System.out.print("Enter your guess : ");
                    guess = s.nextInt();
                    if (guess<number){
                        System.out.println("Incorrect, the number is more than "+guess);
                        count++;
                    } else if(guess>number){
                        System.out.println("Incorrect, the number is less than "+guess);
                        count++;
                    } else if(guess==number){
                        System.out.println("Congratulations, you guessed the correct number in "+count+" attemps");
                    }
                    if (count > 3){
                        System.out.println("Sorry, you're out of attemps");
                        System.out.println("the correct number is "+number);
                    }
                  }
                break;
        }
    }
}
