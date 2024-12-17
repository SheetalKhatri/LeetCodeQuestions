public class ValidWordAbbrevation {
    public static boolean validWordAbbreviation(String word, String abbr) {
        // Replace the following return statement with your code

        int w = 0;
        int a = 0;
        int len = abbr.length();
        int wlen = word.length();
        if (len > wlen) return false;
        while (a < len) {
            if (Character.isDigit(abbr.charAt(a))) {
                if (abbr.charAt(a) == '0') {
                    return false;
                }
                int num = 0;
                while (a < len && Character.isDigit(abbr.charAt(a))){
                    num = num * 10 + Character.getNumericValue(abbr.charAt(a));
                    a++;
                }
                if ((w + num) > wlen) return false;
                w += num;
            }
            else {
                if (abbr.charAt(a) != word.charAt(w)){
                    return false;
                }
                w++;
                a++;
            }
        }

        return w == wlen && a == len;
    }

    public static void main(String[] args){
        String word = "bcnwrhcp";
        //"internationalization";
        String abbr = "08drbff0"; //"13iz4n";
        System.out.println(validWordAbbreviation( word, abbr));
    }
}



    /*another way to do
    int w = 0;
        int a = 0;
        int len = abbr.length();
        int wlen = word.length();

        //char[] abbrChar = abbr.toCharArray();
        //char[] wordChar = word.toCharArray();
        while(w < wlen && a < len){
            if (abbr.charAt(a) == '0') {
                return false;
            }

            if (Character.isLetter(abbr.charAt(a)) && abbr.charAt(a) != word.charAt(w)){
                return false;
            }
            if (Character.isDigit(abbr.charAt(a)) && abbr.charAt(a) != '0') {
                w += Character.getNumericValue(abbr.charAt(a)) - 1;
            }

            while(a < len - 1) {
                if (Character.isDigit(abbr.charAt(a)) && Character.isDigit(abbr.charAt(a + 1))) {
                    int j = Character.getNumericValue(abbr.charAt(a));
                    int k = Character.getNumericValue(abbr.charAt(a + 1));
                    w += j * 10 + k - 1;
                    a++;
                }
                break;
            }

            w++;
            a++;
        }
        return a == len && w == wlen;
    */