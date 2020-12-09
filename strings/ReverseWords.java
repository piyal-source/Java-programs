package strings;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine().trim();
        String[] sArr = st.split(" ");
        for(int i=sArr.length-1; i>=0; i--) {
            sArr[i].trim();
            System.out.print(sArr[i] + " ");
        }
    }
}
