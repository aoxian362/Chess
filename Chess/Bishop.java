public class Bishop extends Piece{
   
   boolean[][] availableMoves;
   
   public Bishop(int x, int y,boolean c){
         xCord = x+1;
         yCord = y+1;
         isWhite = c;
         availableMoves = new boolean[8][8];
 
   }
   
      public boolean[][] canMove(int[][] board){
        
      int x = xCord+1;
      int y = yCord+1; 
      
      
      for(int i=0; i<8; i++)
         for(int l=0; l<8; l++){
            availableMoves[i][l] = false;   
       }
       
       
       while(!(x <0 || x>=8 || y <0 || y >=8)){
         
            if(board[x][y] ==0 || board[x][y] == 8 || board[x][y] == -8)
               availableMoves[x][y] = true;
            else{
            
            availableMoves[x][y] = (board[x][y]>0) == isWhite;
 
            break;            
            }
            x++;
            y++;
       }
       
       x = xCord+1;
       y = yCord-1;
       
       while(!(x <0 || x>=8 || y <0 || y >=8)){
            
            if(board[x][y] ==0 || board[x][y] == 8 || board[x][y] == -8)
               availableMoves[x][y] = true;
            else{
            
            availableMoves[x][y] = (board[x][y] > 0) == isWhite;
 
            break;            
            }
            x++;
            y--;
       }
       
       x = xCord+1;
       y = yCord+1;
       while(!(x <0 || x>=8 || y <0 || y >=8)){
         
            if(board[x][y] ==0 || board[x][y] == 8 || board[x][y] == -8)
               availableMoves[x][y] = true;
            else{
            
            availableMoves[x][y] = (board[x][y]>0) == isWhite;
 
            break;            
            }
            x++;
            y++;
       }
       x = xCord-1;
       y = yCord+1;
       
       while(!(x <0 || x>=8 || y <0 || y >=8)){
         
            if(board[x][y] ==0 || board[x][y] == 8 || board[x][y] == -8)
               availableMoves[x][y] = true;
            else{
            
            availableMoves[x][y] = (board[x][y]>0) == isWhite;
 
            break;            
            }
            x--;
            y++;
       }       
       

       return availableMoves;
   }
   
   
   public void diagnol(int x, int y, int xb, int yb,boolean[][] b,int[][] board){
      
      
      if(x <0 || x>=8 || y <0 || y >=8)
         return;
      
      if(board[x][y] ==0 || board[x][y] == 8 || board[x][y] == -8)
      b[x][y] = true;
      else{
         if(isWhite){
            if(board[x][y]> 0){
            b[x][y] = true;
            }
         }
         else{
            if(board[x][y] < 0){
               b[x][y] = true;
            }
         }
      }
      
      diagnol(x+xb,y+yb,xb,yb,b,board);
   
   }
}