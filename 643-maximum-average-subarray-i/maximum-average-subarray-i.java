class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=0;
        double maxavg = Double.NEGATIVE_INFINITY;
        while(i<=nums.length-k){
        int sum=0;
          for(int l=i;l<i+k;l++){
            sum+=nums[l];
          }
          double avg=(double)sum/k;
          if(avg>maxavg){
            maxavg=avg;
          }
          i++;
        }
        return maxavg;
    }
}