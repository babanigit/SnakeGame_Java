import javax.swing.JFrame;

public class GameFrame extends JFrame {

    public GameFrame() {
        super();

        this.setTitle("Snake Game");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}