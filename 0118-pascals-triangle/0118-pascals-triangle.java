class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        if(numRows==0) return result;
        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        if(numRows==1) return result;
        for(int i=1;i<numRows;i++){
            List<Integer> prevRow=result.get(i-1);
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            row.add(1);
            result.add(row);

        }
        return result;
    }
}
//Approach->first we have to create firstRow manually then in loop other rows are form by using prevRow...bcz prevRow sum is imp to form next row