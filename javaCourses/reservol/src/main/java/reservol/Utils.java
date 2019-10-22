package reservol;

import java.util.Scanner;

public class Utils {
	
    /**
     * Used to collect user's input and check if it's an int
     *
     * @return user choice as int
     */
    public static int userInputInt() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            String input = sc.next();
            System.out.printf("\"%s\" n'est pas valide ! Veuillez entrer un nombre entier.\n", input);
        }
//        sc.close();
        return sc.nextInt();
    }

//    public static int checkInputRange() {
//    	switch case x
//    	si 0 - 3 -> ok
    // switch case
//    	
//    }
}
