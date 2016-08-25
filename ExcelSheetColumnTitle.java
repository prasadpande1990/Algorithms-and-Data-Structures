public class Solution {
    public String convertToTitle(int n) {
        
        StringBuilder title= new StringBuilder();
        while(n!=0){
            int temp = n%26;
            if(temp==0){
                title.append(((char)(temp+90)));
                n=n/26;
                n--;
            }else{
                title.append(((char)(temp+64)));
                n = n/26;
            }
            
        }
        return title.reverse().toString();
    }
}