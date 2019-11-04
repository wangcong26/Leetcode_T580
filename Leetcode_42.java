package leetcode.Leetcode_T580;

//Given n non-negative integers representing an elevation map where the width of each bar is 1, 
//compute how much water it is able to trap after raining.
public class Leetcode_42
{
	public static int trap(int[] height)
	{
		if (height.length == 0)
			return 0;
		int left = 0;
		int right = height.length - 1;
		int leftMax = 0;
		int rightMax = 0;
		int result = 0;
		while (left <= right)
		{
			if (leftMax < rightMax)
			{
				result += leftMax - height[left] > 0 ? leftMax - height[left] : 0;
				leftMax = Math.max(leftMax, height[left]);
				left++;
			} else
			{
				result += rightMax - height[right] > 0 ? rightMax - height[right] : 0;
				rightMax = Math.max(rightMax, height[right]);
				right--;
			}
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		System.out.println(Leetcode_42.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
	}
}
