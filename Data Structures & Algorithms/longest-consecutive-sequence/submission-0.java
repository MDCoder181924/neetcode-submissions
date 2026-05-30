class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int last  = nums[0];
        int ans =1;
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[i]==last) continue;
            if(nums[i]==last || nums[i]==last+1){
                last = nums[i];
                count++;
            }else{
                ans = Math.max(ans , count);
                count = 1;
                last = nums[i];
            }
        }
        ans = Math.max(ans , count);
        return ans;
    }
}
