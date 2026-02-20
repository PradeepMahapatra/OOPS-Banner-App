package uc5;

public class OOPSBannerUC5 {

    public static void main(String[] args) {

        // Inline array declaration and initialization using String.join()
        String[] banner = {
            String.join("", " *****    ", "*****    ", "******    ", "*****  "),
            String.join("", "*     *  ", "*     *   ", "*     *  ", "*     * "),
            String.join("", "*     *  ", "*     *   ", "*     *  ", "*       "),
            String.join("", "*     *  ", "*     *   ", "******    ", "*****  "),
            String.join("", "*     *  ", "*     *   ", "*         ", "      * "),
            String.join("", "*     *  ", "*     *   ", "*         ", "*     * "),
            String.join("", " *****    ", "*****    ", "*         ", "*****  ")
        };

        // Loop to print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
