import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora {
    private float num1, num2, resultado;
    private String operador;
    private JPanel panel1;
    private JButton porciento;
    private JButton del;
    private JButton ac;
    private JButton ocho;
    private JButton cinco;
    private JButton tres;
    private JButton cero;
    private JButton siete;
    private JButton cuatro;
    private JButton uno;
    private JButton dos;
    private JButton nueve;
    private JButton seis;
    private JButton dividir;
    private JButton por;
    private JButton menos;
    private JButton punto;
    private JButton signo;
    private JButton igual;
    private JLabel pantalla;
    private JButton mas;
    private JLabel pantalla2;
    private JButton ans;

    public calculadora(){
        cero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"0");
                pantalla2.setText("");
            }
        });
        uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"1");
                pantalla2.setText("");
            }
        });
        dos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"2");
                pantalla2.setText("");
            }
        });
        tres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"3");
                pantalla2.setText("");
            }
        });
        cuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"4");
                pantalla2.setText("");
            }
        });
        cinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"5");
                pantalla2.setText("");
            }
        });
        seis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"6");
                pantalla2.setText("");
            }
        });
        siete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"7");
                pantalla2.setText("");
            }
        });
        ocho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"8");
                pantalla2.setText("");
            }
        });
        nueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"9");
                pantalla2.setText("");
            }
        });
        punto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(pantalla.getText().contains("."))){
                    pantalla.setText(pantalla.getText()+".");
                    pantalla2.setText("");
                }
            }
        });
        ans.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(sinCero(resultado));
                num1=0;
                num2=0;
            }
        });
        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String retorno=pantalla.getText();
                retorno=retorno.substring(0,retorno.length()-1);
                pantalla.setText(retorno);
            }
        });
        ac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("");
                pantalla2.setText("");
            }
        });

        dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Float.parseFloat(pantalla.getText());
                operador="/";
                pantalla2.setText("÷");
                pantalla.setText("");
            }
        });

        menos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pantalla.getText().equals("")){
                    pantalla.setText("-");
                    pantalla2.setText("-");
                }else{
                    num1=Float.parseFloat(pantalla.getText());
                    operador="-";
                    pantalla2.setText("-");
                    pantalla.setText("");
                }
            }
        });
        signo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Float.parseFloat(pantalla.getText());
                num1=num1*(-1);
                pantalla.setText(sinCero(num1));
            }
        });
        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //num2=Float.parseFloat(pantalla.getText());
                switch (operador) {

                    case "/": {
                        num2 = Float.parseFloat(pantalla.getText());
                        pantalla2.setText("" + sinCero(num1) + operador + sinCero(num2) + "=");
                        resultado = num1 / num2;
                        pantalla.setText(sinCero(resultado));
                        break;
                    }

                    case "-": {
                        num2 = Float.parseFloat(pantalla.getText());
                        pantalla2.setText("" + sinCero(num1) + operador + sinCero(num2) + "=");
                        resultado = num1 - num2;
                        pantalla.setText(sinCero(resultado));
                        break;
                    }
                }
            }
        });
    }
    public static String sinCero(float numero){
        String sincero;
        sincero=Float.toString(numero);
        if (numero%1==0){
            sincero=sincero.substring(0,sincero.length()-2);
        }
        return sincero;
    }
    public static void main (String[]args){
        JFrame frame = new JFrame("CALCULADORA BASICA");
        frame.setContentPane(new calculadora().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}