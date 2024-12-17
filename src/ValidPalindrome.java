public class ValidPalindrome {
    public static boolean isPalindrome(String string) {

        // Replace this placeholder return statement with your code
        //initialize two pointers opposite ends start and end
        //initialize count of unequal char
        //loop until start is greater than end
        //check if each charac at the pointer is unequal
        //add count, skip the character and check for another
        //if count > 1 return false
        //if equal increase start decrease end
        int start = 0;
        int end = string.length() - 1;

        while (start <= end) {
            if (string.charAt(start) != string.charAt(end)) {
                return isPalindromeInRange(string, start,end-1) || isPalindromeInRange(string, start + 1, end);
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static boolean isPalindromeInRange(String word, int start, int end ){
        while (start <= end) {
           if (word.charAt(start) != word.charAt(end)) {
               return false;
           }
           start++;
           end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String string = "es";
        System.out.println(isPalindrome(string));
    }
}
