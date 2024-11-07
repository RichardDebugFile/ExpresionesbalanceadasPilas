import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BalanceadorGUI1 extends JFrame {
    private JTextField txtExpresion;
    private JButton btnVerificar;
    private JLabel lblResultado;
    private JPanel BalanceadorGUI;


    public BalanceadorGUI1(){
        setTitle("Verificador de expresiones balanceadas");
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expresion = txtExpresion.getText();
                String resultado = Balanceador.verificarBalanceo(expresion);
                lblResultado.setText("Resultado: " + resultado);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BalanceadorGUI1");
        frame.setContentPane(new BalanceadorGUI1().BalanceadorGUI);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

