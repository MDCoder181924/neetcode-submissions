class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int zero =0;
        int mul = 1;
        for(int i = 0; i<nums.length ;i++){
           if(nums[i]!=0) mul*=nums[i];
           else zero++;
        }
        for(int i = 0;i<nums.length ; i++){
            if(zero==1){
                if(nums[i]==0) ans[i] = mul;
                else ans[i] = 0;
            }else if(zero>1){
                ans[i] = 0;
            }else{
                ans[i] = mul/nums[i];
            }
        }
        return ans;
    }
}  
