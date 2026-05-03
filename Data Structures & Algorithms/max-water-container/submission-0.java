class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        for(int i=0;i<heights.length-1;i++){
            for(int j=i+1;j<heights.length;j++){
                int l = Math.min(heights[i],heights[j]);
                int b = j - i;
                area = Math.max(area,l*b);
            }
        }
        return area;
        
    }
}
