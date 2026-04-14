import java.util.HashMap;

public class OOPSBannerApp {

    // Create character map using HashMap
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        map.put(' ', new String[]{
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   "
        });

        return map;
    }

    // Display banner
    public static void displayBanner(String message, HashMap<Character, String[]> map) {

        int height = map.get('O').length;

        for (int i = 0; i < height; i++) {
            for (char ch : message.toCharArray()) {
                String[] pattern = map.getOrDefault(ch, map.get(' '));
                System.out.print(pattern[i] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> map = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, map);
    }
}
