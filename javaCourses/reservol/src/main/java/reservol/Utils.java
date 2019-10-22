package reservol;

public class Utils {
	
    /**
     * Used to collect user's input and check if it's an int
     *
     * @return user choice as int
     */
    public int userInputInt() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            String input = sc.next();
            System.out.printf("\"%s\" n'est pas valide ! Veuillez entrer un nombre entier.\n", input);
        }
        return sc.nextInt();
    }

}
