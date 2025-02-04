import java.util.*;
public class UniqueMarkerFinder {
        public static int findPosition(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            // Checking the character uniqueness    
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentChar);
            // Checking whether the set contains exctly 4 characters
            if (right - left + 1 == 4) {
                return right + 1;
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        System.out.println("First marker after character: " + findPosition("bvwbjplbgvbhsrlpgdmjqwftvncz")); 
    }
}