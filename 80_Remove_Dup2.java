class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for(int value : nums){
            if(i == 0 || i == 1 || nums[i-2] != value){
                nums[i++] = value;
            }
        }
        return i;
    }
}