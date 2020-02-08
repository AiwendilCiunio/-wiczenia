package Ćwiczenia;

import java.util.Random;
import java.util.Scanner;


public class RealBlackjack {

    public static int randomize() {
        Random r = new Random();
        int n = 1 + r.nextInt(10);
        return n;
    }
    public static void main( String[] args ){

        Scanner keyboard = new Scanner(System.in);

        String a, b;
        int p1, p2, d1, d2, psum, dsum;
        p1 = randomize();
        p2 = randomize();
        d1 = randomize();
        d2 = randomize();

        psum = p1 + p2;
        dsum = d1 + d2;

        System.out.println("Welcome to Aiwendil's blackjack programme!");
        System.out.println("You get a " + p1 + " and a " + p2 + ".");
        System.out.println("Your total is " + psum + ".");
        System.out.println();
        System.out.println("The dealer has a " + d1 + " showing, and a hidden card.");
        System.out.println("His total is hidden, too.");
        System.out.println();
        do {
            System.out.println("Would you like to 'hit' or 'stay'?");

            a = keyboard.nextLine();

            if (a.equals("hit")) {
                p2 = randomize();
                psum = psum + p2;
                System.out.println("Your drew a " + p2 + ".");
                System.out.println("Your total is a " + psum + ".");
            }
            if (a.equals("stay")) {
                break;
            }
        } while (psum <= 21);

        if (psum > 21) {
            System.out.println("You lost");
        }
        else {
            System.out.println("Okay, dealers turn");
            System.out.println("His hidden card was " + d2 + ".");
            System.out.println("His total was " + dsum + ".");
            do {
                System.out.println("Dealer decides to hit.");
                d2 = randomize();
                dsum = dsum + d2;
                System.out.println("He draws a " + d2 + ".");
                System.out.println("His total is " + dsum + ".");
            } while (dsum < 17);

            if (dsum > 21) {
                System.out.println("You win! Dealer overdrew!");
            }
            else {
                System.out.println("Dealer stays");
                System.out.println();
                System.out.println("Dealer total is " + dsum);
                System.out.println("Your total is " + psum);

                if (psum > dsum) {
                    System.out.println("You win!");
                }
                if (psum == dsum) {
                    System.out.println("Draw.");
                }
                else {
                    System.out.println("You lose.");
                }
            }

        }



    }
}
