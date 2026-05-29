class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i] , 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b) ->  map.get(b) - map.get(a));
        int[] ans = new int[k];
        for(int i = 0; i < ans.length ; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
