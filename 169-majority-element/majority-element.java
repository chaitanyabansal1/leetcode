class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        float n=nums.length/2;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i++){
            float count=1;
            for(int j=i+1;j<nums.length;j++){
               if(nums[i]==nums[j]){
                count++;
                }
                else{
                    break;
                }
            }
            if(count>n){
                return nums[i];
            }
        }
        return -1;
    }
}