package designing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Array_Shuffle {

	int[] nums;
	Random r;

	public Array_Shuffle(int[] nums) {
		this.nums = nums;
		r = new Random();
	}

	/** Resets the array to its original configuration and return it. */
	public int[] reset() {
		for (int i = 0; i < nums.length; i++) {
			System.out.print("reset: " + nums[i] + ",");
		}
		return nums;

	}

	/** Returns a random shuffling of the array. */
	public int[] shuffle() {
		if(nums==null)return null;
		int[] temp = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			temp[i] = nums[i];
		}

		// shuffle
		for (int i = 0; i < temp.length; i++) {
			int rand = r.nextInt(i + 1);
			swap(temp, rand, i);
		}

		// print
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + ",");
		}

		return temp;

	}

	public void swap(int[] nums, int one, int two) {
		int temp = nums[one];
		nums[one] = nums[two];
		nums[two] = temp;

	}

	public static void main(String[] args) {
		int[] a = new int[] { 7, 8, 9 };
		Array_Shuffle nips = new Array_Shuffle(a);
		nips.shuffle();
		System.out.println("");
		nips.reset();

	}

}
