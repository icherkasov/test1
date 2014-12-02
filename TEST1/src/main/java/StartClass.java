import javax.swing.*;
import java.awt.*;
import java.awt.image.renderable.RenderableImageProducer;

/**
 * Created by Illya on 29.11.2014.
 */
public class StartClass {
    StartClass(){
        JFrame frame = new JFrame("Hello programm");                    //not the best
        frame.setBounds(0, 0, 640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());

        JLabel label = new JLabel();
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setText("Hello world");
        frame.add(label,BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public static void main(String [] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StartClass();
            }
        });
    }
}
