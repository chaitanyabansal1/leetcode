class Solution {
    public int removeDuplicates(int[] nums) {
    int pos=0;
    int i=0;
    int j=1;
    while(j<nums.length){
        if(nums[i]!=nums[j]){
            nums[pos]=nums[i];
            pos++;
            
        }
        i++;
        j++;
    }
    nums[pos]=nums[i];
    return pos+1;
    }
}