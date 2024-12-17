public class SortColors {

    /*
    int i = 0 ; i = n-1;
        i = 1; i = n-1-1
        i = 2; i = n-1-2
    swap i value with n-1-i
    */
    public static int[] sortColors (int[] colors) {

        // Write your code here
        int start = 0;
        int current = 0;
        int end = colors.length - 1;
        int temp;
        while (end >= current) {
            if(colors[current] == 0) {
                temp = colors[start];
                colors[start] = colors[current];
                colors[current] = temp;
                start++;
                current++;
            }else if (colors[current] == 1) {
                current++;
            }else if (colors[current] == 2) {
                temp = colors[end];
                colors[end] = colors[current];
                colors[current] = temp;
                end--;
            }
        }
        return colors;
    }
    public static void main(String[] args){
        int[] colors = {2,1,1,0,0};
        //System.out.println(sortColors(colors));
        int[] output = sortColors(colors);
        for (int c : output) {
            System.out.println(c);
        }
    }
}
