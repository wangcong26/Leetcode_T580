package leetcode.Leetcode_T580;

import java.util.HashMap;
import java.util.Map;

class Leetcode_1
{
	public int[] twoSum(int[] nums, int target)
	{
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++)
		{
			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++)
		{
			if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i]))
				return new int[]
				{ i, map.get(target - nums[i]) };
		}

		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args)
	{
		Leetcode_1 twosum = new Leetcode_1();
		int[] nums =
		{ 2, 15, 11, 7 };
		int target = 9;
		int[] result = {};
		result = twosum.twoSum(nums, target);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
}
