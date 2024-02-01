import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Success! The input '" + input + "' is a palindrome.");
        } else {
            System.out.println("No luck this time, try another palindrome!");
        }
    }

    private static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase(); // Remove non-alphanumeric characters and convert to lower case
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
