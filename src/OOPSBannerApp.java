public class OOPSBannerApp {

    // Static Inner Class for Encapsulation
    static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String getRow(int row) {
            return (row >= 0 && row < pattern.length) ? pattern[row] : "";
        }
    }

    public static void main(String[] args) {
        // Define Character Objects
        CharacterPattern charO = new CharacterPattern('O', new String[]{
            "  ***  ", " *   * ", "*     *", "*     *", "*     *", " *   * ", "  ***  "
        });
        CharacterPattern charP = new CharacterPattern('P', new String[]{
            "*****  ", "*    * ", "*    * ", "*****  ", "*      ", "*      ", "*      "
        });
        CharacterPattern charS = new CharacterPattern('S', new String[]{
            " ****  ", "*      ", "*      ", " ****  ", "     * ", "     * ", " ****  "
        });

        // The "OOPS" word mapping
        CharacterPattern[] word = { charO, charO, charP, charS };

        // Render the banner line by line (7 rows)
        for (int i = 0; i < 7; i++) {
            StringBuilder sb = new StringBuilder();
            for (CharacterPattern cp : word) {
                sb.append(cp.getRow(i)).append("  "); // 2-space gap
            }
            System.out.println(sb.toString());
        }
    }
}
