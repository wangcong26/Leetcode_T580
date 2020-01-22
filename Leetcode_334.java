package leetcode.Leetcode_T580;
// 334. Increasing Triplet Subsequence
// Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.

public class Leetcode_334
{
	public boolean increasingTriplet(int[] nums)
	{
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] <= first)
			{
				first = nums[i];
			} else
			{
				if (nums[i] < second)
				{
					second = nums[i];
				}

				if (nums[i] > second)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		Leetcode_334 triplet = new Leetcode_334();
		boolean test = triplet.increasingTriplet(new int[] {1,2,3,4,5});
		System.out.println(test);
	}

}
