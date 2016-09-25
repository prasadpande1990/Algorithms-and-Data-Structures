public class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        
        if(s.isEmpty() || s==null)
            return -1;
        
        for(int i=0;i< s.length();i++){
            char tempChar = s.charAt(i);
            if(!map.containsKey(tempChar)){
                map.put(tempChar,1);
            } else {
                map.put(tempChar,map.get(tempChar)+1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}