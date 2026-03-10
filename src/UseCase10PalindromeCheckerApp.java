public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("UC10: Case-Insensitive & Space-Ignored Palindrome");

        // Original String
        String word = "A man a plan a canal Panama";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        // Reverse the normalized string
        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        // Compare normalized and reversed string
        if (normalized.equals(reversed)) {
            System.out.println("Original String : " + word);
            System.out.println("Normalized String : " + normalized);
            System.out.println("Result : The string is a Palindrome");
        } else {
            System.out.println("Original String : " + word);
            System.out.println("Normalized String : " + normalized);
            System.out.println("Result : The string is NOT a Palindrome");
        }
    }
}