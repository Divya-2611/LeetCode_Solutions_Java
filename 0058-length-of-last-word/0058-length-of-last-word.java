class Solution {
    public int lengthOfLastWord(String s) {
        int k=s.length()-1;
        while(k>=0 && s.charAt(k)==' ')
          k--;
        int length=0;
        for(int i=k;i>=0;i--){
            if(s.charAt(i)!= ' ') length++;
            else break;
        }
        return length;
    }

}