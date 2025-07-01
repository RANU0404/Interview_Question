import java.util.HashSet;
import java.util.Set;

public class Main {

    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLength = 0;
        Set<Character> set = new HashSet<>();

        while (right < s.length()) {
            char current = s.charAt(right);

            if (!set.contains(current)) {
                set.add(current);
                maxLength = Math.max(maxLength, right - left+1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
    public static void main(String []args)
    {
        String n1="abcabcbb";
        String n2="bbbbb";
        System.out.println("Input String :"+n1+"    MaxLength_Substring :"+lengthOfLongestSubstring(n1));
        System.out.println("Input String :"+n2+"     MaxLength_Substring :"+lengthOfLongestSubstring(n2));
    }
 
}