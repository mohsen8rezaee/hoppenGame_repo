import javax.swing.*;

    public class Menu extends JPanel {
        JButton playButton;
        JButton helpButton;
        JButton exitButton;
        public void createButton(){
            playButton = new JButton(new ImageIcon("IMG_3347.JPG"));
            helpButton = new JButton(new ImageIcon("IMG_3348.JPG"));
            exitButton = new JButton(new ImageIcon("IMG_3350.JPG"));
            playButton.setBounds(200,100,200,80);
            helpButton.setBounds(200,200,200,80);
            exitButton.setBounds(200,300,200,80);
            add(playButton);
            this.add(helpButton);
            add(exitButton);
            setLayout(null);
            setVisible(true);
        }
        public Menu(){
            createButton();
        }
    }

