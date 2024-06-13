import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main extends JFrame {
    public Main(){

        Game m = new Game();
        addKeyListener(m);
        add(m);
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
