class Solution {
    public int lengthOfLongestSubstring(String s) {
          int i=0;
          int j=0;
          int maxfreq=0;
          while(j<s.length()){
            boolean repeated=false;
            for(int k=i;k<j;k++){
                if(s.charAt(k)==s.charAt(j)){
                    repeated=true;
                    break;
                }
            }
            if(repeated){
                i++;
            }
            else{
                j++;
            }
            int count=j-i;
            if(count>maxfreq){
                maxfreq=count;
            }
          }
        return maxfreq;
    }
}