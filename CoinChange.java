import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CoinChange {

	// ITERATIVE
	public int coinChange(int[] coins, int amount) {

		if (coins == null || coins.length == 0 || amount < 0) {
			return 0;
		}
		int[] dp = new int[amount + 1]; // dp[0] = 0
		for (int i = 1; i <= amount; ++i) {
			dp[i] = Integer.MAX_VALUE;
			for (int coin : coins) {
				if (coin <= i && dp[i - coin] != -1) {// current coin is not too large and there is a solution for
														// i-coin
					dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
				}
			}
			if (dp[i] == Integer.MAX_VALUE) { // amount == i has no solution
				dp[i] = -1;
			}
		}
		return dp[amount];
	}

	/*
	 * *****************************************************************************
	 * *********************************************
	 */

	// BFS
	public int coinChange3(int[] coins, int amount) {
		if (amount == 0) {
			return 0;
		}

		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[amount + 1];

		queue.offer(amount);
		visited[amount] = true;
		int currLevel = 1;

		while (!queue.isEmpty()) {
			int size = queue.size();
			System.out.println(queue);
			for (int i = 0; i < size; i++) {
				int curr = queue.poll();

				for (int coin : coins) {
					int child = curr - coin;
					if (child == 0) {
						return currLevel;
					} else if (child > 0 && !visited[child]) {
						queue.add(child);
						visited[child] = true;
					}
				}
			}
			currLevel++;
		}

		return -1;
	}

	/*
	 * *****************************************************************************
	 * **********************************************
	 */

	/*
	 * RECURSION
	 * 
	 * Idea Pruning as much as possible while exploring the recursion tree.
	 * 
	 * Recursion Tree <X0, X1, X2,..,Xn-1> are the frequencies of the coins to sum
	 * up to the amount.
	 * 
	 * What are the possible values for Xi? It is [0,amount/Xi].
	 * 
	 * Now all we need is explore all the possible values for each Xi.
	 * 
	 * Pruning Conditions We start with maximum denomination with maximum number of
	 * those coins and recursively call for lower denominations with left over
	 * amount.
	 * 
	 * The reason for doing this we can stop exploring the lower nodes as soon as we
	 * realize count of coins collected so far is exceeding the current minimum (if
	 * higer denomination taking say 10 coins, lower denominations will take more
	 * than 10, so why explore those)
	 * 
	 * Other stop conditions are trivial such as amount -ve and index -ve.
	 */

	int min = Integer.MAX_VALUE;

	public int coinChange4(int[] coins, int amount) {
		Arrays.sort(coins);
		coinChange(coins, amount, coins.length - 1, 0);
		return min == Integer.MAX_VALUE ? -1 : min;
	}

	private void coinChange(int[] coins, int amount, int index, int count) {
		if (amount == 0) {
			min = Math.min(min, count);
			return;
		}
		if (index < 0 || amount < 0 || min < count)
			return;
		for (int freq = amount / coins[index]; freq >= 0; freq--) {
			if (count + freq > min)
				break;
			coinChange(coins, amount - (coins[index] * freq), index - 1, count + freq);
		}
	}

}
