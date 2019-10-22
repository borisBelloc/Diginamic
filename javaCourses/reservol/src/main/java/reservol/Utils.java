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

    /**
     * Check if the user input is in the allowed choice range
     *
     * @param origin     // origin (allowed value):
     *                   // 1 : Démarrage de l’application : 1 <= x <= 3
     * @param userChoice : input entered by the user
     * @return boolean
     */
    public static boolean isUserRangeOk(int origin, int userChoice) {
        switch (origin) {
            case 1:
                if (userChoice > 0 && userChoice <= 3) {
                    return true;
                } else {
                	System.out.println("Votre choix doit être entre 1 et 3");
                    return false;
                }

        }
        return false;
    }
    
    /**
     * Waiting for correct user input
     * @return
     */
    public static int isUserInputOk() {
        int userChoice;
        do {
            System.out.println("Entrez votre choix : ");
        }
        while (!isUserRangeOk(1, userChoice = userInputInt()));
        return userChoice;
    }
    
}
