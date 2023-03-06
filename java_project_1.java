import java.util.*;

import java.util.Scanner;

/**
 * java_project_1
 */
public class java_project_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int systemNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do {
            System.out.println("Guess my number(1-100) : ");    
            userNumber = sc.nextInt();
            if (systemNumber == userNumber) {
                System.out.println("You Guessed it correct");
                break;
            }

            else if(userNumber < systemNumber) {
                System.out.println("Guess a greater Number");
            }

            else {
                System.out.println("Guess a lower Number");
            }

        } while (userNumber >= 0);
        System.out.println("My number was : ");
        System.out.println(systemNumber);
    }
    
}
