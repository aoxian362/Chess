


public class Pawn extends Piece{


   
   
   public boolean[][] canMove(Piece[][] board){
   
   boolean[][] availableMoves = new boolean[8][8];
      for(int i=0; i<8; i++)
         for(int l=0; l<8; l++)
            availableMoves[i][l] = false;
           
           //if(true)
           //return availableMoves;
           
           
                 //move 1 or 2 spaces ahead      
      if(xCord+direction>=0 && xCord+direction <=7)
         if(board[xCord+direction][yCord].PieceID() ==0)
            availableMoves[xCord+direction][yCord] = true;

    
      if(!hasMoved){
         if((xCord+(direction*2)>=0 && xCord+(direction*2) <=7))
            if(board[xCord+(direction*2)][yCord].PieceID() ==0 && board[xCord+direction][yCord].PieceID() ==0)
               availableMoves[xCord+(direction*2)][yCord] = true;
      }
      else
      System.out.println("hello");
   // add enpassent later 
      //captures
      
      if((xCord+direction>=0 && xCord+direction <=7 && yCord + 1 <=7))
        if(board[xCord+direction][yCord+1].PieceID() != 0 && board[xCord+direction][yCord+1].isWhite != isWhite)
          availableMoves[xCord+direction][yCord+1] = true;
          
       if((xCord+direction>=0 && xCord+direction <=7 && yCord - 1 >=0))
         if(board[xCord+direction][yCord-1].PieceID() != 0 && board[xCord+direction][yCord-1].isWhite != isWhite)
            availableMoves[xCord+direction][yCord-1] = true;     
          
     return availableMoves;
      
   }
   
   public Pawn(boolean color, int x, int y){
   isWhite = color;
   if(isWhite)
      direction = 1;
   else
      direction = -1;
      
   xCord = x;
   yCord = y;
   }
   
   public int PieceValue(){
      return 1;
   }
   public int PieceID(){
      return 1;
   }
   public String PieceImage(){
      if(isWhite)
         return "whitePawn.png";   
      else
         return "blackPawn.png";   
   }
   

   
}