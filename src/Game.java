import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Game extends JPanel implements Runnable , KeyListener{
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public ArrayList<Block> BlockList = new ArrayList<>() ;
    Block test = new BrokenBlack( 0 ,600);
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
//        test.paint(g2);
        for (int i = 0; i < 10; i++) {
            int random = RandomNums.getRandomNumber(1,4);//create a random number between 1 & 3
            switch (random){
                case 1 : BlockList.add(new SimpleBlock((((int)screenSize.getWidth())/10)*i,820));
                break;
                case 2 :  BlockList.add(new BrokenBlack((((int)screenSize.getWidth())/10)*i,820));
                break;
                case 3 :  BlockList.add(new EnemyBlock((((int)screenSize.getWidth())/10)*i,820));
                break;
            }
        }
        for (Block block : BlockList) {
            block.paint(g2);
        }
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
