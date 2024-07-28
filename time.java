// LargeTime.java
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class time {

    private static final String[] ZERO = {
            "  ####  ",
            " ##  ## ",
            "##    ##",
            "##    ##",
            "##    ##",
            " ##  ## ",
            "  ####  "
    };

    private static final String[] ONE = {
            "   ##   ",
            "  ###   ",
            "   ##   ",
            "   ##   ",
            "   ##   ",
            "   ##   ",
            " ###### "
    };

    private static final String[] TWO = {
            " #####  ",
            "##   ## ",
            "     ## ",
            "   ###  ",
            "  ##    ",
            " ##     ",
            "####### "
    };

    private static final String[] THREE = {
            " #####  ",
            "##   ## ",
            "     ## ",
            "  ####  ",
            "     ## ",
            "##   ## ",
            " #####  "
    };

    private static final String[] FOUR = {
            "   ###  ",
            "  ####  ",
            " ## ##  ",
            "##  ##  ",
            "####### ",
            "    ##  ",
            "    ##  "
    };

    private static final String[] FIVE = {
            "####### ",
            "##      ",
            "#####   ",
            "     ## ",
            "     ## ",
            "##   ## ",
            " #####  "
    };

    private static final String[] SIX = {
            "  ##### ",
            " ##     ",
            "##      ",
            "######  ",
            "##   ## ",
            "##   ## ",
            " #####  "
    };

    private static final String[] SEVEN = {
            "####### ",
            "     ## ",
            "    ##  ",
            "   ##   ",
            "  ##    ",
            " ##     ",
            "##      "
    };

    private static final String[] EIGHT = {
            " #####  ",
            "##   ## ",
            "##   ## ",
            " #####  ",
            "##   ## ",
            "##   ## ",
            " #####  "
    };

    private static final String[] NINE = {
            " #####  ",
            "##   ## ",
            "##   ## ",
            " ###### ",
            "     ## ",
            "    ##  ",
            " #####  "
    };

    private static final String[] COLON = {
            "        ",
            "   ##   ",
            "   ##   ",
            "        ",
            "   ##   ",
            "   ##   ",
            "        "
    };

    private static final String[][] DIGITS = {ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE};

    private static void printLargeTime(String timeStr) {
        for (int row = 0; row < 7; row++) {
            for (char c : timeStr.toCharArray()) {
                if (Character.isDigit(c)) {
                    System.out.print(DIGITS[c - '0'][row] + " ");
                } else if (c == ':') {
                    System.out.print(COLON[row] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        while (true) {
            LocalTime time = LocalTime.now();
            String timeStr = time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            // Clear screen
            System.out.print("\033[H\033[J");
            printLargeTime(timeStr);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
