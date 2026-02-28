import javax.swing.*;
import java.awt.event.*;

public class UploadPhoto {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Medicine Photo");
        frame.setSize(400, 400);
        frame.setLayout(null);

        JLabel label = new JLabel();
        label.setBounds(50, 50, 300, 200);
        frame.add(label);

        JButton button = new JButton("Upload Medicine Photo");
        button.setBounds(100, 270, 200, 30);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(null);

                if (result == JFileChooser.APPROVE_OPTION) {
                    String path = fileChooser.getSelectedFile().getAbsolutePath();
                    ImageIcon icon = new ImageIcon(path);
                    label.setIcon(icon);
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}