import java.util.Scanner;

public class SafeInput {
        /**
         *
         * @param pipe a Scanner opened to read from System.in
         * @param prompt prompt for the user
         * @return a String response that is not zero length
         */
        public static String getNonZeroLenString(Scanner pipe, String prompt) {
            String retString = ""; // Set this to zero length. Loop runs until it isn't
            do {
                System.out.print("\n" +prompt + ": "); // show prompt add space
                retString = pipe.nextLine();
            } while (retString.length() == 0);
            return retString;
        }
    /**
     * Get an int value with no constraints
     * @param pipe - Scanner instance to read the data System.in in most cases
     * @param prompt - input prompt msg should not include range info
     * @return - unconstrained int value
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
            }
        } while (!done);
        return retVal;
    }
    public static double getDouble(Scanner pipe, String prompt){
        double retVal = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an double: " + trash);
            }
        } while (!done);
        return retVal;
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high){
        int retVal = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                if (retVal <= high && retVal >= low){
                pipe.nextLine();
                done = true;}
                else {
                    trash = pipe.nextLine();
                    System.out.println("Your must enter a value between " + low + " and " + high);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
            }
        } while (!done);
        return retVal;
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high){
        double retVal = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                if (retVal <= high && retVal >= low){
                    pipe.nextLine();
                    done = true;}
                else {
                    trash = pipe.nextLine();
                    System.out.println("Your must enter a value between " + low + " and " + high);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a double: " + trash);
            }
        } while (!done);
        return retVal;
    }
    /**
     * Get a string that matches a RegEx pattern! This is a very powerful method
     * @param pipe - Scanner instance to read the data System.in in most cases
     * @param prompt - prompt for user
     * @param regExPattern - java style RegEx pattern to constrain the input
     * @return a String that matches the RegEx pattern supplied
     */
    public static String getRegExString(Scanner pipe, String prompt, String regExPattern) {
        String response = "";
        boolean gotAVal = false;
        do {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();
            if (response.matches(regExPattern)) {
                gotAVal = true;
            } else {
                System.out.println("\n" + response + " must match the pattern " + regExPattern);
                System.out.println("Try again!");
            }
        } while (!gotAVal);
        return response;
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt){
        String response = "";
        boolean done = false;
        boolean result = false;
        do {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("y")){
                result = true;
                done = true;
            } else if (response.equalsIgnoreCase("n")) {
                result = false;
                done = true;
            }
            else {
                System.out.println("Invalid selection " + response);
            }
        }
        while (!done);
        return result;
    }}





