import javax.swing.*;

public class calculadora {
    private JPanel panel1;
    private JButton resultado;
    private JFormattedTextField RESULTADOFormattedTextField;

    /*
    public calculadora() {
        resultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
     */

    public static void main(String[] args) {
        JFrame frame=new JFrame("calculadora");
        frame.setContentPane(new calculadora().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
