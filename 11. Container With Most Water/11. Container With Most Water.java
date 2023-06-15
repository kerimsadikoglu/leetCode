class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int glbMax = 0;
        
        while (left < right) {
            int minBar = Math.min(height[left], height[right]);
            int area = minBar * (right - left);
            
            glbMax = Math.max(glbMax, area);
            
            if (height[left] < height[right]) {
                left++;
            }
            else if (height[left] > height[right]) {
                right--;
            }
            else {
                left++;
                right--;
            }
        }
        
        return glbMax;
    }
}