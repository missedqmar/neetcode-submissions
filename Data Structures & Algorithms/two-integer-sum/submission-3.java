class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> neededNum = new HashMap<>();


        for(int i=0; i<nums.length; i++){
            int currentNeeded = target - nums[i];
            if(neededNum.containsKey(currentNeeded)){
                int otherIndex = neededNum.get(currentNeeded);
                int[] ans = {otherIndex, i};
                return ans;
            } else{
                neededNum.put(nums[i], i);
            }
        }
        //issue.
        int[] ans = {-1,-1};
        return ans;
    }
}
