class Solution {
    public String longestPalindrome(String s) {
        String l = "";
        for(int i = 0;i<s.length();i++){
            for(int j = i;j<s.length();j++){
                String str = s.substring(i,j+1);
                if(ispalin(str)&& l.length()<str.length()){
                     l = str;
                }
            }
        }
            return l;
        }
         static boolean ispalin(String s){
          
            int st = 0;
            int end = s.length()-1;
            while(st < end){
                if(s.charAt(st)!=s.charAt(end)){
                    return false;
                }
                st++;
                end--;
            }
            return true;
        }
    
}