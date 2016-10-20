public class Solution {
    public boolean isPalindrome(String s) {
        
        String t = s.replaceAll("[^a-zA-Z0-9]+","").toLowerCase();
        if(s.length()==0 || s==null)
            return true;
            
        int i = 0;
        int j = t.length()-1;
        while(i<j){
            if(t.charAt(i)!=t.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}