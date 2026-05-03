class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length-1;
        int area = Integer.MIN_VALUE;
        while(i<j){
            int l = Math.min(heights[i],heights[j]);
            int b = Math.abs(j-i);
            area = Math.max(area,l*b);
            if(heights[i]<=heights[j])i++;
            else j--;
    }
    return area;
    }
}
