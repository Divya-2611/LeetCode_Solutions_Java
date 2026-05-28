class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int ori=x;
        int rev=0;
        while(ori!=0){
            int digit=ori%10;
            rev=rev*10+digit;
            ori=ori/10;

        }
        return x==rev;
    }
}

// TC ->O(logn) with base 10
// SC -> O(1)