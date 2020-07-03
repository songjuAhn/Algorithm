package E200703;

public class FourBlockGame {
	public int solution(int m, int n, String[] board) {
        int answer = 0;
        Boolean flag = true;
        char[][] boardPan = new char[m][n];
        
        //2차원배열로 변환
        for (int i = 0; i < m; i++) {
        	boardPan[i] = board[i].toCharArray();
        }
        
        
        while (flag) {
        	int[][] check = new int[m][n];
            flag = false;
            //check 4 block
            for (int i = 0; i <m-1;i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (boardPan[i][j] == 0)
                        continue;
                    if ((boardPan[i][j] == boardPan[i][j + 1])&& (boardPan[i][j]== boardPan[i + 1][j])&&
                    		(boardPan[i][j]== boardPan[i + 1][j + 1])) {
                    	check[i][j] = 1;
                    	check[i][j+1] = 1;
                    	check[i+1][j] = 1;
                    	check[i + 1][j + 1] = 1;
                        flag = true;
                    }
                }
            }
            
            //remove block
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (check[i][j]==1) {
                        answer++;
                        for (int k = i-1; k >=0; k--) {
                        	boardPan[k + 1][j] = boardPan[k][j];
                        	boardPan[k][j] = 0;
                        }
                    }
                }
            }

        }
        return answer;
    }
}
