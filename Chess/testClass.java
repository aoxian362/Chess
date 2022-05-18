public class testClass{
   public static void main(String[] args){
   int[][] board = new int[8][8];
   Rook knight = new Rook(0,7,true);
   Piece[] pieces = new Piece[1];
   pieces[0] = knight;
   boolean[][] cMove;
   for(int i=0; i<8; i++)
      for(int l=0; l<8; l++){
         board[i][l] =0;
   }
   
   cMove = pieces[0].canMove(board);
   
      for(int i=7; i>=0; i--){
        for(int l=0; l<8; l++){
        if(cMove[i][l])
        System.out.print(1+" ");
        else
        System.out.print(0+ " ");
   }
      System.out.println();
   
   }
   
   }

}