import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Окно");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int width = 500, height = 500;
        frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height);
        JPanel panel = new JPanel ();
        panel.setFocusable(true);
        frame.add(panel);
        panel.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_SPACE) // Если нажат пробел
                    new JOptionPane().showMessageDialog(panel,"Артём","Имя", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        frame.setVisible(true);
    }
}