class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int newArray[]=new int[digits.length+1];
        newArray[0]=1;
        return newArray;
    }
}

//TC ->O(n)
//SC ->O(1) in most cases and O(n) when the all digits are 9 and new array is created