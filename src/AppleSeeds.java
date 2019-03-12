import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppleSeeds {
    private JTextField textField1;
    private JTextPane textPane1;
    private JButton button1;
    private JPanel pineapple;
    private JTextArea textArea1;

    public AppleSeeds() {
        textArea1.setEditable(false); textArea1.setText("How Much Apples From Your Weight  " +
                "  Based on Lbs Calculation and Human");
        textPane1.setEditable(false);textPane1.setText("Input Stuff To the Top Right");
        button1.setText("Submit Data");
        textField1.setText("");
        final int[] val = {0};
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String p = textField1.getText();
                int weight = -1;
                try {
                    weight = Integer.parseInt(p);
                } catch (NumberFormatException l) {
                    System.out.println("ERROR: Should be Number Lbs");
                }
                int l = (int)Math.ceil(useMassofSeedstoGetAppleNumber(returnNecessarygSeedsMass(weight)));
                val[0] = l;
                button1.setText("The Amount Of Apples Needed is Approx "+ l+" apples");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "However, minimum apples for side effects is approx "+ (int)(val[0]*.41));
            }
        });
    }
    public static void setApples(int amt){

    }
    public static double returnNecessarygSeedsMass(int weight){
        double kgweight= weight/2.20462;
        //Convert lb to kg (yuck customary)
        //Lethal Dose 1.5 mg/ kg
        return kgweight*1.5;
    }
    public static double useMassofSeedstoGetAppleNumber(double mass){
        return (mass/.505)/5;
        //apples = mass wanted/ (mass/g seed)-> gseed * .76 gseed/apple ->
    }
    public static void main(String[] args) {
        JFrame fram1 = new JFrame();
        fram1.setVisible(true);
        fram1.setContentPane(new AppleSeeds().pineapple);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
