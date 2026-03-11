import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {
    
    // Encapsulated Pattern Class
    static class CharacterPattern {
        private final String[] rows;
        public CharacterPattern(String[] rows) { this.rows = rows; }
        public String getRow(int i) { return rows[i]; }
    }

    // Centralized Registry using HashMap
    private static final Map<Character, CharacterPattern> registry = new HashMap<>();

    static {
        registry.put('O', new CharacterPattern(new String[]{"  ***  ", " *   * ", "*     *", "*     *", "*     *", " *   * ", "  ***  "}));
        registry.put('P', new CharacterPattern(new String[]{"*****  ", "*    * ", "*    * ", "*****  ", "*      ", "*      ", "*      "}));
        registry.put('S', new CharacterPattern(new String[]{" ****  ", "*      ", "*      ", " ****  ", "     * ", "     * ", " ****  "}));
    }

    public static void main(String[] args) {
        String target = "OOPS";
        renderBanner(target);
    }

    private static void renderBanner(String input) {
        // Outer loop for the 7 rows of the banner
        for (int i = 0; i < 7; i++) {
            StringBuilder sb = new StringBuilder();
            // Inner loop to build the row character by character
            for (char c : input.toUpperCase().toCharArray()) {
                if (registry.containsKey(c)) {
                    sb.append(registry.get(c).getRow(i)).append("  ");
                }
            }
            System.out.println(sb.toString());
        }
    }
}
