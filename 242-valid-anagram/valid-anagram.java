class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int freq=map.get(s.charAt(i));
                map.put(s.charAt(i),freq+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
         HashMap<Character,Integer> bmap=new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(!map.containsKey(t.charAt(i))) return false;
            if(bmap.containsKey(t.charAt(i))){
                int freq=bmap.get(t.charAt(i));
                bmap.put(t.charAt(i),freq+1);
            }
            else{
                bmap.put(t.charAt(i),1);
            }
        }
        for(char c:bmap.keySet()){
           int afreq=map.get(c);
           int bfreq=bmap.get(c);
           if(afreq!=bfreq) return false;
        }
         return true;






        // char[] arr1=s.toCharArray();
        // char[] arr2=t.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // for(int i=0;i<arr1.length;i++){
        //     if(arr1[i]!=arr2[i]){
        //         return false;
        //     }
        // }
        // return true;
    }
}