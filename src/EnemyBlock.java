import sun.security.mscapi.CPublicKey;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class EnemyBlock extends Block{

    protected BufferedImage Enemyimg;
    public EnemyBlock(int x , int y ) {
        super.x = x;
        super.y = y;

        try {
            super.imgBlock = ImageIO.read(new File("img/block_or.png"));
            Enemyimg = ImageIO.read(new File("img/bloock.jpg"));
        } catch (IOException e) {
            System.err.println("Not found img ");
        }

    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g ;
        g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,RenderingHints.VALUE_STROKE_PURE);
        g2.drawImage(imgBlock,x,y, this);
        g2.drawImage(Enemyimg,x,700, this);
    }

}
