class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int[] pair = {-1,-1};
        for (int i = 0; i < nums.length; i++)
        {
            Integer potentialNum = map.get(target - nums[i]);
            if (potentialNum == null)
            {
                map.put(nums[i], i);
            }
            else
            {
                pair[0] = Math.min(i,potentialNum);
                pair[1] = Math.max(i, potentialNum);
            }
        }
        return pair;
    }
}
