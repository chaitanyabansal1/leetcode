class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> set=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(set.containsKey(nums[i])){
                return true;
            }
            else{
             set.put(nums[i],1);
            }
        }
        return false;
    }
}