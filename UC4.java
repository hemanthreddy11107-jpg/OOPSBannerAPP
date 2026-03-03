public class UC4 {

    public static void main(String[] args) {

        // Store banner lines inside String array
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

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}