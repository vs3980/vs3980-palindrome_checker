public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("UC4: Character Array Based Palindrome Check");

        // Original String
        String word = "madam";

        // Convert string to character array
        char[] characters = word.toCharArray();

        // Two pointer variables
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Original String : " + word);
            System.out.println("Result : The string is a Palindrome");
        } else {
            System.out.println("Original String : " + word);
            System.out.println("Result : The string is NOT a Palindrome");
        }
    }
}
