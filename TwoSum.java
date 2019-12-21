import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer other;
        for (int i = 0; i < nums.length; ++i) {
            other = map.get(target - nums[i]);
            if (other != null && other != i) {
                return new int[] { i, other };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}