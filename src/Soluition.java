class Solution {
    public int[] twoSum(int[] nums, int target) {
        int nums_length = nums.length;
        int[] result_array = new int[2];
        for(int fixed_i=0; fixed_i<nums_length; fixed_i++) {
            int fixed_num = nums[fixed_i];
            for(int changeable_i=0; changeable_i<nums_length; changeable_i++) {
                if(changeable_i == fixed_i) {
                    break;
                }
                int two_sum = fixed_num + nums[changeable_i];
                if(two_sum == target) {
                    if(fixed_i < changeable_i) {
                        result_array[0] = fixed_i;
                        result_array[1] = changeable_i;
                    } else {
                        result_array[0] = changeable_i;
                        result_array[1] = fixed_i;
                    }
                }
            }
        }
        return result_array;
    }
}