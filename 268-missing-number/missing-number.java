class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int origsum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length+1;i++){
            origsum+=i;
        }
        int no=origsum-sum;
         
            return no;
         
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==i){
        //         continue;
        //     }
        //     else {
        //         return i;
        //     }
        // }
        
        // return nums.length;
    }
}