public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("UC3: Palindrome Check Using String Reverse");

        // Original String
        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using for loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Display reversed string
        System.out.println("Original String : " + word);
        System.out.println("Reversed String : " + reversed);

        // Compare original and reversed string
        if (word.equals(reversed)) {
            System.out.println("Result : The string is a Palindrome");
        } else {
            System.out.println("Result : The string is NOT a Palindrome");
        }
    }
}
