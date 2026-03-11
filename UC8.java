import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Centralized Character Pattern Map
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        initializePatterns();

        String word = "OOPS";
        renderBanner(word);
    }

    // Initialize character patterns
    private static void initializePatterns() {

        patternMap.put('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        patternMap.put('P', new String[]{
                "*****",
                "*   *",
                "*****",
                "*",
                "*"
        });

        patternMap.put('S', new String[]{
                "*****",
                "*",
                "*****",
                "    *",
                "*****"
        });
    }

    // Render Banner Function
    public static void renderBanner(String word) {

        int height = patternMap.get(word.charAt(0)).length;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("   ");
                }
            }

            System.out.println(line.toString());
        }
    }
}