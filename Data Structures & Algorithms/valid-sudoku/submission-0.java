class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            int[] arr = new int[9];
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == '.') continue;
                int idx = board[i][j] - '1';
                if(arr[idx] == 1) return false;
                arr[idx] = 1;
            }
        }

        for(int j = 0; j < 9; j++) {
            int[] arr = new int[9];
            for(int i = 0; i < 9; i++) {
                if(board[i][j] == '.') continue;
                int idx = board[i][j] - '1';
                if(arr[idx] == 1) return false;
                arr[idx] = 1;
            }
        }

        for(int row = 0; row < 9; row += 3) {
            for(int col = 0; col < 9; col += 3) {
                int[] arr = new int[9];
                for(int i = row; i < row + 3; i++) {
                    for(int j = col; j < col + 3; j++) {
                        if(board[i][j] == '.') continue;
                        int idx = board[i][j] - '1';
                        if(arr[idx] == 1) return false;
                        arr[idx] = 1;
                    }
                }
            }
        }
        return true;
    }
}
