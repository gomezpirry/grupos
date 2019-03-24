import javax.swing.JPanel;
import java.util.List;
import java.util.ArrayList;

public class Board extends JPanel {

  /**
   * Definir Clases Box y Token
   */
  
  private Box[][] boxes;
  private List<Token> tokens;
  public int size;
  
  public Board(int size) {
    this.size = size;
    boxes = new Box[size][size];
    for(int i = 0; i < size; i++)
      for(int j = 0; j < size; j++) {
        boxes[i][j] = new Box();
      }

    tokens = new ArrayList<Token>();
    this.setBackground(Color.DARK_GRAY);
    this.setMinimumSize(new Dimension(800, 800));
    this.setPreferredSize(new Dimension(800,800));
  }
  
  public void updateBoard() {
    int boxWidth = this.getWidth()/size;
    int boxHeight = this.getHeight()/size;
    int panelHeight = this.getHeight();
    
    for(int row = 0; row < size; row++)
      for(int column = 0; column < size; column++) {
        // Basandose en estas posiciones, indicar los atributos de Box
        System.out.println("pos X: " + (column * boxWidth));
        System.out.println("pos y: " + (panelHeight - ((row + 1)  * boxHeight)));
        System.out.println("width: " + boxWidth);
        System.out.println("height: " + boxHeight);
      }
  }
}