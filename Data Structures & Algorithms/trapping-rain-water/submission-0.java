class Solution {
    public int trap(int[] height) {
        int ans = 0;
        for(int i = 0; i<height.length ; i++){
            int max = -1;
            for(int j = i-1;j>=0 ; j--){
                if(height[i]<height[j]){
                    max = Math.max(max ,height[j]-height[i]);
                }
            }
            int max2 = -1;
            for(int j = i+1;j<height.length ; j++){
                if(height[i]<height[j]){
                    max2 = Math.max(max2 ,height[j]-height[i]);
                }
            }
            if(max!=-1 && max2!=-1){
                ans+= Math.min(max , max2);
            }
        }
        return ans;
    }
}
