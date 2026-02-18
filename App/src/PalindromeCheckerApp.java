public class PalindromeCheckerApp {
    public static void main(String[] args){
        /*Use Case 3:String Reverse Palindrome Validation

        Description:
        This class checks whether a string is a palindrome
        by reversing the string and comparing it with
        the original value.


        At this stage, the application:
         - Iterates the string in reverse order.
         - Builds a reversed version.
         - Compares original and reversed strings.
         - Displays the validation result.

        This introduces transformation-based validation.

        @author Developer
        @version 3.0
         */
        class UseCase3PalindromeCheckerApp{

                public static void main(String[] args) {

                    // Original String
                    String original = "madam";

                    // Original String
                    String original = "madam";

                    // Loop (for loop) to reverse the string
                    for (int i = original.length() - 1; i >= 0; i--) {
                        reversed = reversed + original.charAt(i);  // String Concatenation
                    }

                    // Compare original and reversed using equals() method
                    if (original.equals(reversed)) {
                        System.out.println(original + " is a Palindrome.");
                    } else {
                        System.out.println(original + " is NOT a Palindrome.");
                    }
                }
            }


        }
    }

