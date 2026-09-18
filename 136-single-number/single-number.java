class Solution {
    public int singleNumber(int[] nums) {
    
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }
        else{
            map.put(nums[i],1);
        }
     }
     for(int ele:map.keySet()){
         if(map.get(ele)!=2){
            return ele;
         }
     }
return -1;


    // for(int i=0;i<nums.length;i++){
    //     int count=0;
    //     for(int j=0;j<nums.length;j++)
    //     {
    //              if(i != j && nums[i]==nums[j]){
    //                 count=1;
    //              }
                 
    //     } 
    //     if(count==0){
    //         return nums[i];
    //     }  
    // }
    //         return -1;
        }
    }
