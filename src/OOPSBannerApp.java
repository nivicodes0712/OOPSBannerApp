public class OOPSBannerApp {
    public static void main(String[] args) {
        String symbol = "*";
        int width = 30;

        // UC5 Goal: Combine declaration, initialization, and String.join()
        String[] banner = {
            String.join("", java.util.Collections.nCopies(width, symbol)), // Line 1: Top Border
            symbol + " ".repeat(width - 2) + symbol,                      // Line 2: Spacer
            symbol + "      JAVA OPTIMIZED        " + symbol,            // Line 3: Content
            symbol + "       USE CASE 05          " + symbol,            // Line 4: Content
            symbol + " ".repeat(width - 2) + symbol,                      // Line 5: Spacer
            String.join("", java.util.Collections.nCopies(width, symbol))  // Line 6: Bottom Border
        };

        // Efficient iteration using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
