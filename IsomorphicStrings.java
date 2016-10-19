public class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        char[] result = new char[s.length()];
        
        for(int i=0;i< s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        for(int i=0;i<s.length();i++){
            result[i] = map.get(s.charAt(i));
        }
        if(new String(result).equals(t))
            return true;
        return false;
        
    }
}