public class PalindromeCheckerApp {
    public static void main(String[] args){
        /*Use Case 2:Hardcoded Palindrome Validation

        Description:
        This class demonstrates basic palindrome validation using a hardcoded string value.

        At this stage, the application:
         - Stores a predefined string
         - Compares characters from both ends
         - Determines whether the string is a palindrome
         - Displays the result on the console

        This use case introduces fundamental comparison logic before using advanced data structure.

        @author Developer
        @version 2.0
         */
        class UseCase2PalindromeCheckerApp{

                public static void main(String[] args) {

                    // String Literal
                    String word = "madam";

                    // Variable to store reversed string
                    String reversed = "";

                    // Reverse the string using loop
                    for (int i = word.length() - 1; i >= 0; i--) {
                        reversed = reversed + word.charAt(i);
                    }

                    // Conditional Statement (if-else)
                    if (word.equals(reversed)) {
                        System.out.println(word + " is a Palindrome.");
                    } else {
                        System.out.println(word + " is NOT a Palindrome.");
                    }
                }
            }


        }
    }

