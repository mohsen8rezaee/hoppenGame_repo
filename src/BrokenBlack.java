import javax.imageio.ImageIO;
import javax.naming.spi.DirectoryManager;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BrokenBlack extends Block{




    public BrokenBlack(int x, int y){
        super.x = x;
        super.y = y;

        try {
            super.imgBlock = ImageIO.read(new File("img/block_or2.png"));
        }
        catch (IOException e) {
            System.err.println("Not found img ");
        }
    }



}
