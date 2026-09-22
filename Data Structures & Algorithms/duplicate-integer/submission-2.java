class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numbersChecked = new HashSet<>();

        for(int number: nums)
        {
            if(numbersChecked.add(number) == false)
            {
                return true;
            }
        }
        return false;
    }
}