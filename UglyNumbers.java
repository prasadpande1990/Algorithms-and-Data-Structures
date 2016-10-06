public class Solution {
    public boolean isUgly(int num) {
        
        if(num==0)
            return false;
        if(num==1)
            return true;
        return factorize(num);
    }
    
    public boolean factorize(int num){
        if (num==1)
            return true;
            
        if(num%2==0){
            num = num/2;
            return factorize(num);
        }
        if(num%3==0){
            num = num/3;
            return factorize(num);
        }
        if(num%5==0){
            num = num/5;
            return factorize(num);
        }
        return false;    
            
    }
}