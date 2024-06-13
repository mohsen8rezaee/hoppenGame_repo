import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class Game extends JPanel implements Runnable , KeyListener{
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private BufferedImage background;
    private Thread hoppen;
    Hero heroObject = new Hero(this);
    public Game(){
        try{
            background = ImageIO.read(new File("img/backg.png"));

//            background.getScaledInstance(deviceSize.getWidth(),deviceSize.getHeight(),Image.SCALE_DEFAULT);
        } catch (IOException e) {
            System.err.println("Not found img ");
        }
    }
    public void addNotify(){
        super.addNotify();
        hoppen = new Thread(this);
        hoppen.start();
    }
    public void paint(Graphics g){

        super.paint(g);
        Graphics2D g2 = (Graphics2D) g ;
        g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,RenderingHints.VALUE_STROKE_PURE);
        g2.drawImage(background,0,0,(int)screenSize.getWidth(),(int)screenSize.getHeight(),Color.black,this);

        heroObject.paint(g2);
    }
    public void move(){
        heroObject.move();
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {

    }

}
