class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();
        s=s.replace(" ","");
        t=t.replace(" ","");
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            count[t.charAt(i)-'a']--;
        }
        for(int c:count){
            if(c!=0) return false;
        }
        return true;
    }
}

// Approach->Brute force approach is sort the string and check 
//           Optimized way is to form bucket array of 26 size and for first string ++ and for second string and check bucket array each element is equal to 0 or not