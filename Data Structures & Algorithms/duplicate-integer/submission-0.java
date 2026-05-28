class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++)
        {
            if (map.get(nums[i])!= null)
            {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}