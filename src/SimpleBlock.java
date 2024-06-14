import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class SimpleBlock extends Block {
    public SimpleBlock(int x , int y){
        super.x = x;
        super.y =y;

        try {
            super.imgBlock = ImageIO.read(new File("img/block_or.png"));
        }
        catch (IOException e) {
            System.err.println("Not found img ");
        }
    }
}
