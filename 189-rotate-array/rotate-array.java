class Solution {
    public void rotate(int[] nums, int k) {
    k=k%nums.length;
    int n=nums.length;
    rotate(nums,0,n-1);
    rotate(nums,0,k-1);
    rotate(nums,k,n-1);
    }
    public void rotate(int[] nums,int i,int j){
    while(i<j){
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
        i++;
        j--;
    }
    }

    //         while(k-->0){
    //         rotateone(nums);
    //         }      
    // }
    //  public void rotateone(int[] nums){
    //         int l=nums[nums.length-1];
    //         for(int i=nums.length-1;i>0;i--)
    //          {
    //                nums[i]=nums[i-1];
    //          }
    //          nums[0]=l;
    //         }

}