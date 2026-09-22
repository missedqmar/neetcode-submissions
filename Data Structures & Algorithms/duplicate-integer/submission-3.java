class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> freqMap = new HashMap<>();

        if(nums.length==0){
            return false;
        }
        for(int i=0; i< nums.length; i++){
            if(!freqMap.containsKey(nums[i])){
                freqMap.put(nums[i], 1);
            } else{
                //freq is atleast one, return true
                return true;
            }
        }

        return false;
    }
}