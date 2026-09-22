class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums == null) return false;
        if(nums.length == 1 || nums.length == 0) return false;

        Map<Integer,Boolean> seen = new HashMap<>();

        for(int curr: nums){
                if(seen.containsKey(curr)){
                    return true;
                }else{
                    seen.put(curr,true);
                }
        }
        return false;
    }
}