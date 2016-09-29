public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        
        List<Integer> temp = new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        
        if(nums1.length==0 || nums2.length==0)
            return new int[0];
            
        for(int i=0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i])){
                map.put(nums1[i],1);
            } else {
                map.put(nums1[i],map.get(nums1[i])+1);
            }
        }
        
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                temp.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        
        int[] result = new int[temp.size()];
        return temp.stream().mapToInt(i->i).toArray(); //Only applicable with Java 8
        
    }
}