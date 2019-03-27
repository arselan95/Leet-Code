
/*
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. 

The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?


Input: m = 3, n = 2
Output: 3
Explanation:
From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Right -> Down
2. Right -> Down -> Right
3. Down -> Right -> Right
 */
public class UniquePaths_RobotInGrid_DownRight {
	
	  /*
    - first move - one unit
    - go down or right<- unique path is one 
    - diagonal sum (sum of left and right top)
    
    - 2 dimensional array to store unique paths 
    - left border and top border unique path is just one 
    - so path[i][0]=1
    - and path[o][i]=1
    - and the diagonal sum is denoted by path[i][j]=path[i][j-1]+path[i-1][j]
    - return final index path[m-1][n-1]
    */
	public int uniquePaths(int m, int n) {
		if (m <= 0 || n <= 0)
			return 0;
		int[][] a = new int[m][n];
		for (int i = 0; i < m; i++)
			a[i][0] = 1;
		for (int i = 1; i < n; i++)
			a[0][i] = 1;
		for (int i = 1; i < m; i++)
			for (int j = 1; j < n; j++)
				a[i][j] = a[i - 1][j] + a[i][j - 1];

		return a[m - 1][n - 1];

	}

}
