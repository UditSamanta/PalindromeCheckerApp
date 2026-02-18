public class PalindromeCheckerApp {
    public static void main(String[] args){
        /*Use Case 2:Character Array Based Validation

        Description:
        This class validates a palindrome by converting
        the string into a character array and comparing
        characters using the two-pointer technique.

        At this stage, the application:
         - Converts string to char array
         - Uses start and end pointers
         - Compares characters efficiently
         - Displays the result

        This reduces extra memory usage.

        @author Developer
        @version 4.0
         */
        class UseCase4PalindromeCheckerApp{

                public static void main(String[] args) {


                    // Original String
                    String original = "madam";

                    // Convert String to character array
                    char[] characters = original.toCharArray();

                    // Two-pointer technique
                    int start = 0;
                    int end = characters.length - 1;

                    boolean isPalindrome = true;

                    while (start < end) {

                        // Compare start and end characters
                        if (characters[start] != characters[end]) {
                            isPalindrome = false;
                            break;
                        }

                        start++;
                        end--;
                    }

                    // Display result
                    if (isPalindrome) {
                        System.out.println(original + " is a Palindrome.");
                    } else {
                        System.out.println(original + " is NOT a Palindrome.");
                    }
                }
            }


        }
    }

