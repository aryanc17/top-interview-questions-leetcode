class Solution {

    static void reverse(int nums[], int st, int end){
        while(st <= end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;

        if(k <= n){
        reverse(nums,0, n-k-1);
        reverse(nums,n-k, n-1);
        reverse(nums,0, n-1);
        }

        else{
            reverse(nums, 0, n-1);
        }
    }
}