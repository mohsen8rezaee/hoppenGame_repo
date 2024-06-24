import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main extends JFrame {
     static JPanel centerPanel= new JPanel();
     static Game m = new Game();
     Menu menu = new Menu();
    static void showGamePanel(){
        centerPanel.add(m);
    }
    public Main(){
        centerPanel.setLayout( new BoxLayout(centerPanel,BoxLayout.Y_AXIS));
        centerPanel.add(menu);
        addKeyListener(m);
        add(m);
        add(centerPanel);
        setTitle("Hoppenhelm");
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(true);
//        setSize(400, 500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }


    public static void main(String[] args) {
        new Main();
    }



}
