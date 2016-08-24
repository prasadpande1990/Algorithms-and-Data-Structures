public class Solution {
    public int titleToNumber(String s) {
        
        char [] input = s.toUpperCase().toCharArray();
        int i = s.length() - 1;
        int ind=0;
        int columnNumber=0;
        while(i >= 0){
            int temp = (int)input[i--];
            columnNumber = columnNumber + (temp-64) * (int) Math.pow(26,ind++);
        }
        return columnNumber;
    }
}