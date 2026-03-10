import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("UC6: Queue + Stack Based Palindrome Check");

        // Original String
        String word = "madam";

        // Create Stack and Queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into Stack and Queue
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            stack.push(ch);     // LIFO
            queue.add(ch);      // FIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue from queue and pop from stack
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();  // FIFO
            char fromStack = stack.pop();     // LIFO

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
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