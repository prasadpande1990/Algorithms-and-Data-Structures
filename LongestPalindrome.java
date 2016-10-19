public class Solution {
    public int longestPalindrome(String s) {
        
        if(s.length()==0 || s==null)
            return 0;
            
        HashSet<Character> hSet = new HashSet<Character>();
        int length = 0;
        for(int i=0;i<s.length();i++){
            if(hSet.contains(s.charAt(i))){
                hSet.remove(s.charAt(i));
                length++;
            } else {
                hSet.add(s.charAt(i));
            }
        }
        if(!hSet.isEmpty())
            return (length*2+1);
        else
            return length*2;
    }
}