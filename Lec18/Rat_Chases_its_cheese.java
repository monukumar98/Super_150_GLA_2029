package Lec18;

import java.util.Scanner;

public class Rat_Chases_its_cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {// row
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);
			}

		}
		int[][] ans = new int[n][m];
		print(maze, 0, 0, ans);
		if (c == 0) {
			System.out.println("NO PATH FOUND");
		}

	}

	static int c = 0;

	public static void print(char[][] maze, int cr, int cc, int[][] ans) {
		if (cr < 0 || cc < 0 || cc >= maze[0].length || cr >= maze.length || maze[cr][cc] == 'X') {
			return;
		}
		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			ans[cr][cc] = 1;
			Display(ans);
			c = 1;
			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		print(maze, cr - 1, cc, ans);// up
		print(maze, cr, cc - 1, ans);// right
		print(maze, cr + 1, cc, ans);// down
		print(maze, cr, cc + 1, ans);// left
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;

	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}

}
