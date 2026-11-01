class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int tw = 0;
        int left = 0,right=n-1;
        int lmax=0,rmax=0;


        while(left < right)
        {
            lmax = Math.max(lmax,height[left]);
            rmax = Math.max(rmax,height[right]);

            if(lmax < rmax) {
                tw += (lmax-height[left]);
                left++;
            }

            else{
                tw += (rmax-height[right]);
                right--;
            }
        }
        return tw;
    }
}