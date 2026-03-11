public class UC5 {

    public static void main(String[] args) {

        // Inline declaration + initialization
        String[] banner = {
                String.join("", "*", "*", "*", "*", "*", "   ",
                                "*", "*", "*", "*", "*", "   ",
                                "*", "*", "*", "*", "*", "   ",
                                "*", "*", "*", "*", "*"),

                String.join("", "*", "       ", "*", "   ",
                                "*", "       ", "*", "   ",
                                "*", "       ", "   ",
                                "*", "       ", "*"),

                String.join("", "*", "       ", "*", "   ",
                                "*", "*", "*", "*", "*", "   ",
                                "*", "*", "*", "*", "   ",
                                "*", "*", "*", "*", "*"),

                String.join("", "*", "       ", "*", "   ",
                                "*", "       ", "*", "   ",
                                "*", "       ", "   ",
                                "*", "   ", "*"),

                String.join("", "*", "*", "*", "*", "*", "   ",
                                "*", "*", "*", "*", "*", "   ",
                                "*", "       ", "   ",
                                "*", "       ", "*")
        };

        // Enhanced for-loop for display
        for (String line : banner) {
            System.out.println(line);
        }
    }
}