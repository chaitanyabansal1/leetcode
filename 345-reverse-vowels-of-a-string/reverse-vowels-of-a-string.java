class Solution {
    public String reverseVowels(String s) {
       
        char[] str=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' ||
            str[i]=='A' ||str[i]=='E' ||str[i]=='I' ||str[i]=='O' || str[i]=='U' ){
                if(str[j]=='a' || str[j]=='e' || str[j]=='i' || str[j]=='o' || str[j]=='u' ||str[j]=='A' ||str[j]=='E' ||str[j]=='I' ||str[j]=='O' || str[j]=='U' ){
                    char temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                    i++;
                    j--;
                }
                else{
                    j--;
                }
            }
            else{
                i++;
            }
            
        }
      return new String(str);
    }
}