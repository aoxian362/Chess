
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

class tickedSquare implements ActionListener
{
    public int[][] board;
    boolean iSelected = false;
    int colorSelect = -1;
    public int selectedPX = -1;
    public int selectedPY = -1;
    ChessTiles[][] button;
    boolean[] clicked;
    ImageIcon moveIcon;
    ChessTiles currButton;
    Piece[][] allPieces;
    Piece[] WhitePieces;
    Piece[] BlackPieces;
    int currPiece;
    public int xCord;
    public int yCord;
    
    

    public tickedSquare(ChessTiles[][] butt,int[][] b,boolean[] tg)
    {
      boolean swap = true;
      button = butt;
     
      clicked = tg;
       board = b;
       ImageIcon moveIcon = new ImageIcon();
       WhitePieces = new Piece[12];
       BlackPieces = new Piece[12];
       allPieces = new Piece[2][12];
       
       WhitePieces[0] = new Pawn(-1,-1,swap);
       WhitePieces[1] = new Knight(-1,-1,swap);
       WhitePieces[2] = new Bishop(-1,-1,swap);
       WhitePieces[3] = new Rook(-1,-1,swap);
       WhitePieces[4] = new Queen(-1,-1,swap);
       WhitePieces[5] = new king(-1,-1,swap);
       
       swap = !swap;
       
       BlackPieces[0] = new Pawn(-1,-1,swap);
       BlackPieces[1] = new Knight(-1,-1,swap);
       BlackPieces[2] = new Bishop(-1,-1,swap);
       BlackPieces[3] = new Rook(-1,-1,swap);
       BlackPieces[4] = new Queen(-1,-1,swap);
       BlackPieces[5] = new king(-1,-1,swap);
       
       allPieces[0] = WhitePieces;
       allPieces[1] = BlackPieces;
       
     
       
    }
    
    public void setCords(int x, int y){
        xCord = x;
        yCord = y;
    }
    
    public void actionPerformed(ActionEvent e)
    {
    currButton = (ChessTiles)e.getSource();
    int i = currButton.getXCord();
    int l = currButton.getYCord();
    if(!clicked[0]){
      
         
         xCord = i;
         yCord = l;
         if(board[i][l] != 0 && (board[i][l] != 8 || board[i][l] !=-8)){
         
        
         if(board[i][l] >0){
         currPiece = (board[i][l])-1;
         colorSelect = 1;
         }
         else{
         currPiece = (-(board[i][l]))-1;
         colorSelect = 0;        
         }
         
         
      
         allPieces[colorSelect][currPiece].setCords(i,l);
                  
         moveIcon = (ImageIcon)((ChessTiles)button[i][l]).getIcon();
         clicked[0] = !clicked[0];
        
         return;
         }
         else{
         return;
         }
         
         
         
    }
    
    
    
    else{
      clicked[0] = !clicked[0];
            
            
            
            if(moveIcon != null){
            
            if(colorSelect != -1)
            printPiece(allPieces[colorSelect][currPiece].canMove(board));
            
            if(allPieces[colorSelect][currPiece].canMove(board)[i][l]){
            
            ((ChessTiles)e.getSource()).setIcon(moveIcon);
            
            board[i][l] = board[xCord][yCord];
            board[xCord][yCord] = 0; // check later for enpassent

            button[xCord][yCord].setIcon(null);
            
            
            printBoard();  
            return;
            }
            }
            else
            System.out.println("null image");
   
            //printBoard();         
            return;
         }
    }
 
    
    
    public void printBoard(){
      for(int i=7; i>=0; i--){
         for(int l=0; l<8; l++)
            System.out.print(-board[i][l]+" ");
            
            System.out.println();
         } 
         
         System.out.println();
         System.out.println();  
    }
    
    
    public void printPiece(boolean[][] cMove){
    
          for(int i=7; i>=0; i--){
        for(int l=0; l<8; l++){
        if(cMove[i][l])
        System.out.print(1+" ");
        else
        System.out.print(0+ " ");
   }
      System.out.println();
   
   }
   
            
         System.out.println();
         System.out.println();  
    
    
    }
    
    

}

