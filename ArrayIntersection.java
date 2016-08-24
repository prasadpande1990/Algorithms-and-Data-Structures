public class ArrayIntersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> firstSet = new HashSet<Integer>();
        Set<Integer> intersect = new HashSet<Integer>();
        
        for(int i=0;i<nums1.length;i++){
            firstSet.add(nums1[i]);
        }
        for(int j=0;j< nums2.length;j++){
            if(firstSet.contains(nums2[j]))
                intersect.add(nums2[j]);
        } 
        int [] result = new int[intersect.size()];
        int j = 0;
        for(Integer num: intersect){
            result[j] = num;
            j++;
        }
        return result;
    }
}