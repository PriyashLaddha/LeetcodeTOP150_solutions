class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            // A letter is founs so count
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                // Its a white space instad
                // Did we already counrt the word??
                // yes, so we found the last word
                if (count > 0)
                    return count;
            }
        }
        return count;

    }

}