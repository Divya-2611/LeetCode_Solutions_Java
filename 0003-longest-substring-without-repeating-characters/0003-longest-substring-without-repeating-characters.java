class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set <Character> set=new HashSet<>();
        int left=0;
        int maxLength=0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){  //2.Duplicate found then remove till that duplicate character 
              set.remove(s.charAt(left));           //  is not present in hashset
               left++; 
                                               
            }

            set.add(s.charAt(right));                 //1.Add char to hashset till dupilcate found
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
        
    }
    
}

// TC ->O(n)
// Sc ->O(1) bcz set can contain at most fixed 256 unique char which is constant