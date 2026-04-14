public class OOPSBannerApp {

    // 🔹 Inner Class
    static class CharacterPatternMap {
        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // 🔹 Create patterns
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] maps = new CharacterPatternMap[4];

        maps[0] = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        maps[1] = new CharacterPatternMap('P', new String[]{
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        });

        maps[2] = new CharacterPatternMap('S', new String[]{
                " *****",
                "*     ",
                "*     ",
                " *****",
                "      *",
                "      *",
                " *****"
        });

        maps[3] = new CharacterPatternMap(' ', new String[]{
                "  ",
                "  ",
                "  ",
                "  ",
                "  ",
                "  ",
                "  "
        });

        return maps;
    }

    // 🔹 Get pattern
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return maps[3].getPattern(); // space fallback
    }

    // 🔹 Print banner
    public static void printMessage(String message, CharacterPatternMap[] maps) {

        for (int i = 0; i < 7; i++) { // 7 lines per character

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, maps);
                System.out.print(pattern[i] + "  ");
            }

            System.out.println();
        }
    }

    // 🔹 Main method
    public static void main(String[] args) {

        CharacterPatternMap[] maps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, maps);
    }
}
