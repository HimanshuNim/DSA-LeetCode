class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        char[][] board=new char[n][n];
        for(char[] row: board)Arrays.fill(row,'.');
        int[] leftRow=new int[n];
        int[] lowerDiagonal=new int[2*n-1];
        int[] upperDiagonal=new int[2*n-1];
        solve(0,board,n,leftRow,upperDiagonal,lowerDiagonal,res);
        return res;
    }

    //Function to solve N-Queens
    public void solve(int col,char[][]board,int n,int[] leftRow,int[]upperDiagonal,int[]lowerDiagonal,List<List<String>>res) {
        //if all queens are placed
        if(col==n) {
            List<String>temp=new ArrayList<>();
            for(int i=0;i<n;i++) {
                temp.add(new String(board[i]));
            }
            res.add(temp);
            return;
        }
        //through rowss
        for(int row=0;row<n;row++){
            //check safety
            if(leftRow[row]==0&&lowerDiagonal[row+col]==0&&upperDiagonal[n-1+col-row]==0){
                //place the queen
                board[row][col]='Q';
                leftRow[row]=1;
                lowerDiagonal[row+col]=1;
                upperDiagonal[n-1+col-row]=1;
                //recure

                solve(col+1,board,n,leftRow,upperDiagonal,lowerDiagonal,res);

                //back to base babe

                board[row][col]='.';
                leftRow[row]=0;
                lowerDiagonal[row+col]=0;
                upperDiagonal[n-1+col-row]=0;
            }
        }
    }
}