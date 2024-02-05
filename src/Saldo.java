import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo {
    public JPanel saldo;
    private JButton MENUButton;
    private JTextField saldotextField1;
    public Transaccion transaccion;

    public Saldo() {
        saldotextField1.setText("0");
        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(MENUButton);
                frame.dispose();
                JFrame frames = new JFrame("QUE TRANSACCION VA A REALIZAR");
                frames.setContentPane(new Transaccion().transaccion);
                frames.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frames.pack();
                frame.setLocationRelativeTo(null);
                frames.setVisible(true);
            }
        });
    }

    public JTextField getSaldotextField1() {
        return saldotextField1;
    }

    public void setSaldotextField1(JTextField saldotextField1) {
        this.saldotextField1 = saldotextField1;
    }
}