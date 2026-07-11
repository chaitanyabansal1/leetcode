class Solution {
    public int searchInsert(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            if(target<=nums[i]){
                return i;
            }
            // else if(target<nums[0]){
            //     return 0;
            // }
        }
        // for(int i=0;i<nums.length;i++){
        //     for(int j=1;j<nums.length;j++){
        //     if(target>nums[i] && target<nums[j]){
        //         return i+1;
        //     }
        //     else if(j==nums.length-1 && target>nums[j]){
        //         return j+1;

        //     }

        // }
    // }
    return nums.length;
    }
}