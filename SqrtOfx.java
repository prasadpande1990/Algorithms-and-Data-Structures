public class Solution {
    public int mySqrt(int x) {
     if(x==1)
        return 1;
     if(x==0)
        return 0;
        
     return (int)Math.pow(x,0.5);
    }
}