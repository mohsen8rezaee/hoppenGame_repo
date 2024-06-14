import javax.imageio.ImageIO;
import javax.naming.spi.DirectoryManager;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class Block extends JPanel{
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    protected int x , y;
    protected static int width = ((int)screenSize.getWidth()) / 10;
    protected static int height = ((int)screenSize.getHeight()) / 5;
    protected BufferedImage imgBlock;

    public void paint(Graphics g){

        super.paint(g);
        Graphics2D g2 = (Graphics2D) g ;
        g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,RenderingHints.VALUE_STROKE_PURE);
        g2.drawImage(imgBlock,x,y,this);


    }

}
