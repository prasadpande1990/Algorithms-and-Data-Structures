public class ReverseString {
    public String reverseString(String s) {
        
        if(s.length()==0 || s.equals(""))
            return "";
            
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while(start < end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
        
    }
}