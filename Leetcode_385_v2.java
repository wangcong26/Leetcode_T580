package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Shuffle an array
public class Leetcode_385_v2
{
	private int[] original;
	private int[] array;
	private Random rand = new Random();

	private List<Integer> getArrayCopy()
	{
		List<Integer> asList = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++)
		{
			asList.add(array[i]);
		}
		return asList;
	}

	public Leetcode_385_v2(int[] nums)
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
		List<Integer> aux = getArrayCopy();

		for (int i = 0; i < array.length; i++)
		{
			int removeIdx = rand.nextInt(aux.size());
			array[i] = aux.get(removeIdx);
			aux.remove(removeIdx);
		}
		return array;
	}
}
