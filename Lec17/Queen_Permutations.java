package Lec17;

public class Queen_Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[] board = new boolean[n];
		int tq = 2;
		Permutation(board, tq, "", 0);

	}
	public static void Permutation(boolean[] board,int tq,String ans,int qpsf) {
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if(board[i]==false) {
				board[i]=true;
				Permutation(board, tq, ans+"b"+i+"q"+qpsf,qpsf+1);
				board[i]=false;//UNDO
			}
		}
		
	}

}
