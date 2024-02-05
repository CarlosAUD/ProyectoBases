import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo {
    public JPanel saldo;
    private JButton MENUButton;
    private JTextField saldotextField1;
    public Transaccion transaccion;
    static int saldoTotal;

    public Saldo() {
        actualizarSaldo(saldotextField1);
        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(MENUButton);
                frame.dispose();
                JFrame frames = new JFrame("QUE TRANSACCION VA A REALIZAR");
                frames.setContentPane(new Transaccion().transaccion);
                frames.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frames.setSize(400,350);
                frames.setLocationRelativeTo(null);
                frames.setVisible(true);
            }
        });
    }

    public void actualizarSaldo(JTextField saldotextField1) {
        saldotextField1.setText(String.valueOf(saldoTotal));
    }
}