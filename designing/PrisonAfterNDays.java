package designing;

public class PrisonAfterNDays {
	public int[] prisonAfterNDays(int[] cells, int N) {
		if (N == 0)
			return cells;

		// corner case
		if (N % 14 == 0) {
			N = 14;
		} else {
			N = N % 14;
		}

		// check for N
		while (N > 0) {
			int[] res = new int[8];
			// since first and last element do not have adjecent
			res[0] = 0;
			res[7] = 0;

			for (int i = 1; i < 7; i++) {
				if (cells[i - 1] == cells[i + 1]) {
					res[i] = 1;
				} else {
					res[i] = 0;
				}
			}
			cells = res;
			N--;
		}

		return cells;
	}

}
