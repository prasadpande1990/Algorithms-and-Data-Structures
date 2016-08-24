public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(k < 1 || t < 0)
        	return false;

        TreeSet<Long> set = new TreeSet<Long>();
        for(int i=0;i<nums.length;i++){

        	long upperLimit = (long)nums[i] + t + 1;
        	long lowerLimit = (long)nums[i] - t;

        	Set<Long> subset = set.subSet(lowerLimit,upperLimit);

        	if(!subset.isEmpty())
        		return true;
        		
        	set.add((long)nums[i]);

        	if(i>=k)
        		set.remove((long)nums[i-k]);

        }
        return false;
    }
}