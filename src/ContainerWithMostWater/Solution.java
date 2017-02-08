package ContainerWithMostWater;

/**
 * Created by lkq on 2017/2/8.
 */
public class Solution {
    public int maxArea(int[] height){
        if (height.length < 2)
            return 0;
        int ans = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r){
            int v = (r - l) * Math.min(height[l], height[r]);
            if (v > ans)
                ans = v;
            if (height[l] < height[r])
                l++;
            else r--;
        }
        return ans;
    }

    public int MaxArea2(int[] height){
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while (left < right && left >= 0 && right <= height.length - 1){
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if (height[left] > height[right])
                right --;
            else
                left ++;
        }
        return maxArea;
    }
}
