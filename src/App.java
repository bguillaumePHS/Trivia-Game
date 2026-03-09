import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String response = "";
        int score = 0;


        // Question 1
        System.out.println("How many continents are there?");
        System.out.println("  A) 5");
        System.out.println("  B) 6");
        System.out.println("  C) 7");
        response = input.nextLine();
        if(response.equalsIgnoreCase("C")) {
            System.out.println("Correct! Nice work");
            score += 1;
        } else {
            System.out.println("Sorry, not correct.");
        }

        // Question 2
        System.out.println("What's the tallest building in the world?");
        System.out.println("  A) The Empire State Building");
        System.out.println("  B) Burj Khalifa");
        System.out.println("  C) Sears Tower");
        response = input.nextLine();
        if(response.equalsIgnoreCase("B")) {
            System.out.println("Correct! Nice work");
            score += 1;
        } else {
            System.out.println("Sorry, not correct.");
        }

        // Question 3
        System.out.println("What's the best Christmas movie");
        System.out.println("  A) Die Hard");
        System.out.println("  B) White Christmas");
        System.out.println("  C) Frosty the Snowman");
        response = input.nextLine();
        if(response.equalsIgnoreCase("A")) {
            System.out.println("Correct! Nice work");
            score += 1;
        } else {
            System.out.println("Sorry, not correct.");
        }

        // Question 4
        System.out.println("What was the best F1 racing team in the 2025-26 season?");
        System.out.println("  A) Ferari");
        System.out.println("  B) McLaren");
        System.out.println("  C) Mercedes");
        System.out.println("  D) Red Bull");
        response = input.nextLine();
        if(response.equalsIgnoreCase("B")) {
            System.out.println("Correct! Nice work");
            score += 1;
        } else {
            System.out.println("Sorry, not correct.");
        }

        System.out.println();
        System.out.println("You got " + score + "/4 correct!");

        //Close the Scanner
        input.close();
    }
}
