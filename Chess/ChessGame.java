import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.util.ArrayList;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ChessGame extends JFrame{


   private JPanel mainPanel;
   private ChessTiles[][] Buttons;
   private ArrayList<String> list;
   private boolean[] target;
   public int[][] board;
   boolean[][] availableMoves;
   
   private int tx = -1;
   private int ty = -1;
   private ImageIcon blackPawn; // 1
   private ImageIcon blackKnight;// 2
   private ImageIcon blackBishop; // 3
   private ImageIcon blackRook; //4
   private ImageIcon blackQueen; // 5
   private ImageIcon blackKing; // 6

   private ImageIcon whitePawn; //-1
   private ImageIcon whiteKnight; //-2
   private ImageIcon whiteBishop; // -3
   private ImageIcon whiteRook; // -4
   private ImageIcon whiteQueen;// -5
   private ImageIcon whiteKing;  // -6 
   private String[] blackPiecesPng;
   private String[] whitePiecesPng;
   public ChessGame(){
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(700,700);
      buildPanel();
      buildBoard();
      add(mainPanel,BorderLayout.CENTER);
      setVisible(true);
   
   }
   
   public void resetMoves(){

   for(int i=0; i<8; i++)
      for(int l=0; l<8; l++)
         availableMoves[i][l] = false;
   }
   
   public void buildBoard(){
   String[] blackPiecesPng = {"blackPawn.png","blackKnight.png","blackBishop.png",
   "blackRook.png","blackQueen.png","blackKing.png"};
   String[] whitePiecesPng = {"whitePawn.png","whiteKnight.png","whiteBishop.png",
   "whiteRook.png","whiteQueen.png","whiteKing.png"};
   
   board = new int[8][8];
   availableMoves = new boolean[8][8];
   
   blackPawn = new ImageIcon("blackPawn.png");
   blackKnight = new ImageIcon("blackKnight.png");
   blackBishop = new ImageIcon("blackBishop.png");
   blackRook = new ImageIcon("blackRook.png");   
   blackQueen = new ImageIcon("blackQueen.png");
   blackKing = new ImageIcon("blackKing.png");
   
   
   whitePawn = new ImageIcon("whitePawn.png");
   whiteKnight = new ImageIcon("whiteKnight.png");
   whiteBishop = new ImageIcon("whiteBishop.png");
   whiteRook = new ImageIcon("whiteRook.png");   
   whiteQueen = new ImageIcon("whiteQueen.png");
   whiteKing = new ImageIcon("whiteKing.png");

    for(int i=0; i<8; i++)
      for(int l=0; l<8; l++){
         board[i][l] = 0;  
         availableMoves[i][l] = false;
         }
    
        
        try {
      Buttons[7][0].setIcon((blackRook));
      Buttons[7][7].setIcon((blackRook));
      board[7][0] = 4;
      board[7][7] = 4;
      
      
      Buttons[7][1].setIcon((blackKnight));
      Buttons[7][6].setIcon((blackKnight));
      board[7][1] = 2;
      board[7][6] = 2;
      
      
      Buttons[7][2].setIcon((blackBishop));
      Buttons[7][5].setIcon((blackBishop));
      
      board[7][2] = 3;
      board[7][5] = 3;
      
      Buttons[7][3].setIcon((blackKing));
      Buttons[7][4].setIcon(blackQueen);
      
      board[7][4] = 5;
      board[7][3] = 6;
      
      Buttons[0][0].setIcon((whiteRook));
      Buttons[0][7].setIcon((whiteRook));
      
      board[0][0] = -4;
      board[0][7] = -4;
      
      
      Buttons[0][1].setIcon((whiteKnight));
      Buttons[0][6].setIcon((whiteKnight));
      
      
      board[0][1] = -2;
      board[0][6] = -2;
      
      Buttons[0][2].setIcon((whiteBishop));
      Buttons[0][5].setIcon((whiteBishop));
      
      board[0][2] = -3;
      board[0][5] = -3;
      
      Buttons[0][3].setIcon((whiteKing));
      Buttons[0][4].setIcon(whiteQueen);
      
      board[0][4] = -5;
      board[0][3] = -6;
      
      for(int i=0; i<8; i++){
      
      Buttons[6][i].setIcon(blackPawn);
      Buttons[1][i].setIcon(whitePawn);
      board[6][i] = 1;
      board[1][i] = -1;
      
      }
      

  } catch (Exception ex) {
    System.out.println(ex);
  }

      tickedSquare chessListen= new tickedSquare(Buttons , board,target); 
      
      for(int i=0; i<8; i++)
         for(int l=0; l<8; l++){

            Buttons[i][l].addActionListener(chessListen);    
            mainPanel.add(Buttons[i][l],i,l);       

}
   
   }
   
 
   
   public void buildPanel(){
      mainPanel = new JPanel();
      
      mainPanel.setSize(500,500);
      mainPanel.setBackground(Color.GRAY);
      mainPanel.setLayout(new GridLayout(8,8));
      target = new boolean[1];
      target[0] = false;
      Buttons = new ChessTiles[8][8];
      for(int i=0; i<8; i++){
       for(int l=0; l<8; l++){
  
         Buttons[i][l] = new ChessTiles(i,l);
         
         if(i%2 == l%2)
         Buttons[i][l].setBackground(Color.RED);
         else
         Buttons[i][l].setBackground(new Color(100,100,100));
         
         Buttons[i][l].setBorder(BorderFactory.createLineBorder(Color.black));
         Buttons[i][l].setSize(10,10);
         }
      }

   
   
   }

   
   public static void main(String[] args){
      new ChessGame();
   }
}