class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int pal=x;
        int reverse=0;
        
        while(x!=0){
            int ld=x%10;
            reverse=reverse*10 + ld;
            x=x/10;
        }
        if(reverse==pal){
            return true;
        }
        else{
            return false;
        }
    }
}