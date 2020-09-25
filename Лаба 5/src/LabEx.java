import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;


public class LabEx extends JFrame{


    private Image bufferedImage;

    public LabEx() {
        super("Image Test");
        setLayout(new FlowLayout());
        setSize(700, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    public void loadImage(){
        String imagePath = ("src/1535352411_KrldwCrvbv4.jpg");
        bufferedImage = new ImageIcon(imagePath).getImage();
    }

    public void drawIcon() {
        Graphics g = getGraphics();
        g.drawImage(bufferedImage, 0, 0, 700, 600, null);
    }

    public static void main(String[] args){
        LabEx frame = new LabEx();
        frame.loadImage();
        frame.drawIcon();
    }
}
