package uc6;

/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
 * Refactors banner logic into reusable helper methods.
 */
public class OOPSBannerUC6 {

    // Method to generate pattern for 'O'
    public static String[] getOPattern() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Method to generate pattern for 'P'
    public static String[] getPPattern() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Method to generate pattern for 'S'
    public static String[] getSPattern() {
        return new String[] {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        // Get patterns using methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Loop to print banner
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + "  " +
                oPattern[i] + "  " +
                pPattern[i] + "  " +
                sPattern[i]
            );
        }
    }
}
