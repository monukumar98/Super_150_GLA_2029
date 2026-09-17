package Lec10;

public class Find_the_Minimum_Area_to_Cover_All_Ones_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 0, 1, 0 }, { 1, 0, 1 } };
		System.out.println(Find_the_Minimum_Area_to_Cover(grid));
	}

	public static int Find_the_Minimum_Area_to_Cover(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		int ans = Integer.MAX_VALUE;
		// case-1
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j + 1 < n; j++) {
				ans = Math.min(ans,
						res(arr, 0, 0, i, m - 1) + res(arr, i + 1, 0, j, m - 1) + res(arr, j + 1, 0, n - 1, m - 1));
			}
		}
		// case-2
		for (int i = 0; i < m; i++) {
			for (int j = i + 1; j + 1 < m; j++) {
				ans = Math.min(ans,
						res(arr, 0, 0, n - 1, i) + res(arr, 0, i + 1, n - 1, j) + res(arr, 0, j + 1, n - 1, m - 1));
			}
		}
		// case-3
		for (int i = 0; i + 1 < n; i++) {
			for (int j = 0; j + 1 < m; j++) {
				ans = Math.min(ans,
						res(arr, 0, 0, i, j) + res(arr, 0, j + 1, i, m - 1) + res(arr, i + 1, 0, n - 1, m - 1));
			}
		}
		// case-4
		for (int i = 0; i + 1 < n; i++) {
			for (int j = 0; j + 1 < m; j++) {
				ans = Math.min(ans,
						res(arr, 0, 0, i, m - 1) + res(arr, i + 1, 0, n - 1, j) + res(arr, i + 1, j + 1, n - 1, m - 1));
			}
		}
		// case-5
		for (int i = 0; i + 1 < n; i++) {
			for (int j = 0; j + 1 < m; j++) {
				ans = Math.min(ans,
						res(arr, 0, 0, n-1, j) + 
						res(arr, 0, j+1, i, m-1) + 
						res(arr, i + 1, j + 1, n - 1, m - 1));
			}
		}
		// case-6
		for (int i = 0; i + 1 < n; i++) {
			for (int j = 0; j + 1 < m; j++) {
				ans = Math.min(ans,
						res(arr, 0, 0, i, j) + 
						res(arr, i+1, 0, n-1, j) + 
						res(arr, 0, j + 1, n - 1, m - 1));
			}
		}
		return ans;

	}

	public static int res(int[][] arr, int cr, int cc, int er, int ec) {
		int minr = Integer.MAX_VALUE;
		int minc = Integer.MAX_VALUE;
		int maxr = Integer.MIN_VALUE;
		int maxc = Integer.MIN_VALUE;
		for (int i = cr; i <= er; i++) {
			for (int j = cc; j <= ec; j++) {
				if (arr[i][j] == 1) {
					minr = Math.min(minr, i);
					minc = Math.min(minc, j);
					maxr = Math.max(maxr, i);
					maxc = Math.max(maxc, j);
				}
			}
		}
		int l = maxr - minr + 1;
		int b = maxc - minc + 1;
		return l * b;

	}

}
