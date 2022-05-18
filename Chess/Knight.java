public class Knight extends Piece{


   boolean[][] availableMoves;
   
   public Knight(int x, int y,boolean c){
   
   isWhite = c;
   xCord = x;
   yCord = y;
   availableMoves = new boolean[8][8];
   
      
   }

      public boolean[][] canMove(int[][] board){
        
        for(int i=0; i<8; i++)
           for(int l=0; l<8; l++){
              availableMoves[i][l] = false;   
            }
            
            
      if(!(xCord-2<0)){
         if(!(yCord+1 >=8))
               availableMoves[xCord-2][yCord+1] = (board[xCord-2][yCord+1] ==0 ||(board[xCord-2][yCord+1] >=1) == isWhite);
         
         if(!(yCord-1 <0))
              availableMoves[xCord-2][yCord-1] = (board[xCord-2][yCord-1] ==0 || (board[xCord-2][yCord-1] >=1) == isWhite);

         }
         
       if(!(xCord+2 >=8)){
         if(!(yCord+1 >=8))
               availableMoves[xCord+2][yCord+1] = (board[xCord+2][yCord+1] ==0 ||(board[xCord+2][yCord+1] >=1) == isWhite);
               
         if(!(yCord-1 <0))
              availableMoves[xCord+2][yCord-1] = (board[xCord+2][yCord-1] ==0 ||(board[xCord+2][yCord-1] >=1) == isWhite);
         
       }
       
       if(!(xCord+1 >=8)){
         if(!(yCord+2 >=8))
            availableMoves[xCord+1][yCord+2] = (board[xCord+1][yCord+2] ==0 ||(board[xCord+1][yCord+2] >=1) == isWhite);
         
         if(!(yCord-2 <0))
            availableMoves[xCord+1][yCord-2] = (board[xCord+1][yCord-2] ==0 ||(board[xCord+1][yCord-2] >=1) == isWhite);
            
         
       }
       
       if(!(xCord-1 <0)){
         if(!(yCord+2 >=8))
            availableMoves[xCord-1][yCord+2] = (board[xCord-1][yCord+2] ==0 ||(board[xCord-1][yCord+2] >=1) == isWhite);
         
         if(!(yCord-2 <0))
            availableMoves[xCord-1][yCord-2] = (board[xCord-1][yCord-2] ==0 ||(board[xCord-1][yCord-2] >=1) == isWhite);       
       
       
       }
       
      
      
      return availableMoves;
      }
      
      
      
}