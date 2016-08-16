public class MoveZerosToEnd {
    public void moveZeroes(int[] nums) {
        
        /*int numOfZeros = 0;
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] == 0){
                numOfZeros++;
            } else {
                int temp = nums[i];
                nums[i] = 0;
                nums[i-numOfZeros] = temp;
            }
        }*/
        
        int insertIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        while(insertIndex < nums.length){
            nums[insertIndex++] = 0;
        }
        
    }
}