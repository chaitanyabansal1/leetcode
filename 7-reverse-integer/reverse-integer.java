class Solution {
    public int reverse(int x) {
        int nx=0;
        while(x!=0){
            int ld=x%10;
            if( (nx>Integer.MAX_VALUE/10) || (nx<Integer.MIN_VALUE/10)){
                return 0;
            }
            nx=nx*10+ld;
            x=x/10;
        }
        return nx;
        }

    }
