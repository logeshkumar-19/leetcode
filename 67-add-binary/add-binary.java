class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int l = a.length()-1;
        int k = b.length()-1;
        int carry =0;
        while(l >=0 || k >=0 || carry !=0){
            int sum =carry ;
            if(l >= 0){
                sum += a.charAt(l)- '0';
                l--;
            }
            if(k >= 0){
                sum += b.charAt(k) - '0';
                k--;
            }
            sb.append(sum %2);
            carry = sum / 2;
        }
        return sb.reverse().toString();

    }
}