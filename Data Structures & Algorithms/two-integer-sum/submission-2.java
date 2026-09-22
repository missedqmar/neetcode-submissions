class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> visited = new HashMap<>();
    

        for(int i=0; i< nums.length; i++){
            int need = target - nums[i];
            if(visited.containsKey(need)){
                return new int[]{visited.get(need),i};
            } else{
                visited.put(nums[i],i);
            }
        }
        return null;
    }
}
