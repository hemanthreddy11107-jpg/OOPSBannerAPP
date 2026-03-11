import java.util.HashMap;
import java.util.Map;

public class UC7 {

    public static void main(String[] args) {

        String word = "OOPS";

        // Build character pattern map
        CharacterPatternMap patternMap = new CharacterPatternMap();

        // Retrieve height dynamically (all patterns same height)
        int height = patternMap.getPattern('O').getPattern().length;

        // Render banner row by row
        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPattern cp = patternMap.getPattern(ch);
                line.append(cp.getPattern()[row]).append("   ");
            }

            System.out.println(line.toString());
        }
    }

    // Static Inner Class to encapsulate Character Data
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Pattern Map Class
    static class CharacterPatternMap {

        private Map<Character, CharacterPattern> patternMap = new HashMap<>();

        public CharacterPatternMap() {

            patternMap.put('O', new CharacterPattern('O', new String[]{
                    "*****",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*****"
            }));

            patternMap.put('P', new CharacterPattern('P', new String[]{
                    "*****",
                    "*   *",
                    "*****",
                    "*",
                    "*"
            }));

            patternMap.put('S', new CharacterPattern('S', new String[]{
                    "*****",
                    "*",
                    "*****",
                    "    *",
                    "*****"
            }));
        }

        public CharacterPattern getPattern(char ch) {
            return patternMap.get(ch);
        }
    }
}