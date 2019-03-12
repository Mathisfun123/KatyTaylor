import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaFXattempt {
    private JButton button1;
    private JPanel frame1;
    private JTextField textField1;
    private JTextPane textPane1;

    public JavaFXattempt() {
        textPane1.setEditable(false);
       button1.setText("Click Here to Say Hi");
       textPane1.setText("Input Stuff To the Right");
       textField1.setText("");
       textField1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String p = textField1.getText();
               System.out.println(p);
           }
       });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello");
            }
        });
    }

    public static void main(String[] args) {
        JFrame fram1 = new JFrame();
        fram1.setVisible(true);
        fram1.setContentPane(new JavaFXattempt().frame1);
    }
}
