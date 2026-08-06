class Solution {
    public int smallestNumber(int n, int t) {
        int l=n;
        int num=1;
        while(n!=0){
            int ld=n%10;
            num=num*ld;
            n=n/10;
        }
        if(num%t==0){
            return l;
        }
        else{
        int i=1;
        while(num%t!=0){
        num=1;
        int j=l+i;
         while(j!=0){
            int db=j%10;
            num=num*db;
            j=j/10;
        }  
          i++;
        }
        return l+i-1;
        }
    }
}