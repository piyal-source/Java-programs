package strings;

public class CheckAnagrams {
    public static void main(String[] args) {
        String s1 = "aba";
        String s2 = "abc";
        boolean isAnagram = false;
        if(s1.length() == s2.length()) {
            isAnagram = true;
            int[] visited = new int[256];
            for(char c: s1.toCharArray()) {
                visited[(int)c] += 1;
            }
            for(char c: s2.toCharArray()) {
                visited[(int)c] -= 1;
            }
            for(int i=0;i<256; i++) {
                if(visited[i] != 0 ) {
                    isAnagram = false;
                }
            }
        }
        System.out.println(isAnagram);
    }
}
