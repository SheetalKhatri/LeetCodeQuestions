import java.util.HashMap;

public class Main {

    //(, ), {, }, [ and ]
    //if str[0] starts with closing bracket return false
    //create hashmap key as opening bracket and value as closing bracket
    //if each element starts with something that is not in the hashmap return false
    public static int subSequenceLongest(String s){

        //max length
        //current length
        //loop through the String
        //if i strng and i+1 String is same
        //add +1 to currentlength
        //check if currentlength is greater than max length and replace value
        //retuen max length
        int maxlen = 0;
        int currlen = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i+1)) {
                currlen += 1;
            }
            else {
                currlen += 1;
                if(maxlen < currlen) {
                    maxlen = currlen;
                }
                currlen = 0;
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(subSequenceLongest(s));
    }
}