import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.*;
public class Hero extends JPanel implements KeyListener {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private BufferedImage heroImage ;
    private int x, y; // Locations
    private int dx = 0;
    private Game game;

    public Hero(Game game){

        this.game = game;

        try{
            heroImage =ImageIO.read(new File("img/hero.png"));
        } catch (IOException e) {
            System.err.println("Not found img ");
        }
    }
    public void paint(Graphics g){

        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        g2.drawImage(heroImage, 0, 580,(int)screenSize.getWidth()/9 ,(int)screenSize.getHeight()/4 , game);
    }
    public void move(){
        x += dx;
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            dx = 3;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        dx = 0;
    }
}
