package leetcode.Leetcode_T580;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Shuffle an array
public class Leetcode_384_v1
{
	private int[] original;
	private int[] array;
	private Random rand = new Random();

	private int randRange(int min, int max)
	{
		return rand.nextInt(max - min) + min;
	}

	private void swapAt(int i, int j)
	{
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public Leetcode_384_v1(int[] nums)
	{
		array = nums;
		original = nums.clone();
	}

	/** Resets the array to its original configuration and return it. */
	public int[] reset()
	{
		array = original;
		original = original.clone();
		return array;
	}

	/** Returns a random shuffling of the array. */
	public int[] shuffle()
	{
		for (int i = 0; i < array.length; i++)
		{
			swapAt(i, randRange(i, array.length));
		}
		return array;
	}
}
