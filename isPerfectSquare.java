public class Solution {
    public boolean isPerfectSquare(int num) {
     
/*     int i=1;
     while(num>0){
         num=num-i;
         i=i+2;
     }
     return num==0;
    }
    Time Complexity : O(n)
*/
        if(num==1)
            return true;
        
        long numl = (long)num;    
        long low = 1;
        long high = numl/2;
        long mid=0;
        while(low <= high){
            mid =  low+(high-low)/2;
            if(mid*mid==numl){
                return true;
            }else if(numl < mid*mid){
                high = mid -1;
            }else{ 
                low = mid + 1;
            }
        }
        return false;
    // Time Complexity: O(log n)    
    }   
    
}