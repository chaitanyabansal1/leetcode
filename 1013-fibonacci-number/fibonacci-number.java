class Solution {
    public int fib(int n) {
     int a=0;
     int b=1;
     int sum=0;
     for(int i=0;i<n;i++){
        sum=a+b;
        a=b;
        b=sum;
     }
     return a;

    //     if(n==1 || n==0) return n;
    //    return fib(n-1) + fib(n-2);
    }
}