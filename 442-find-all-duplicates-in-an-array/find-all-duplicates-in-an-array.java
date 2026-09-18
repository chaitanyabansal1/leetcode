class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr= new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int freq=map.get(nums[i]);
                map.put(nums[i],freq+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int ele:map.keySet()){
            if(map.get(ele)==2){
                arr.add(ele);
            }
        }
        return arr;
    }
}