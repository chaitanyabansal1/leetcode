class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int max = 0;
        int ans = 0;

        for (int x : map.keySet()) {
          if (map.get(x) > max) {
            max = map.get(x);
            ans = x;
         }
        }
        return ans;

        // Arrays.sort(nums);
        // float n=nums.length/2;
        // if(nums.length==1){
        //     return nums[0];
        // }
        // for(int i=0;i<nums.length-1;i++){
        //     float count=1;
        //     for(int j=i+1;j<nums.length;j++){
        //        if(nums[i]==nums[j]){
        //         count++;
        //         }
        //         else{
        //             break;
        //         }
        //     }
        //     if(count>n){
        //         return nums[i];
        //     }
        // }
        // return -1;
    }
}