public class Solution {
    public void sortColors(int[] nums) {
        int reds = 0; 
        int whites=0;
        int blues = nums.length-1;
        while(whites <= blues){
            if(nums[whites]==1){
                whites++;
            } else if (nums[whites]==0){
                int temp = nums[reds];
                nums[reds] = nums[whites];
                nums[whites] = temp;
                reds++;
                whites++;
            } else {
                int temp = nums[blues];
                nums[blues] = nums[whites];
                nums[whites] = temp;
                blues--;
            }
        }       
        
    }
}