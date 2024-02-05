import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposito {
    private JTextField depotext;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton ingresarButton;
    public JPanel depo;
    private JButton MENUButton;
    private JButton borrar;
    private Saldo saldo;
    public Deposito() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"0");
            }
        });

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
        borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String clave= depotext.getText();
                depotext.setText("");
                for (int i=1;i<clave.length();i++){
                    depotext.setText(depotext.getText()+clave.charAt(i-1));
                }
            }
        });
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String depos = depotext.getText();
                if (depos.isEmpty() || depos.equals("0")){
                    JOptionPane.showMessageDialog(null, "Ingrese un valor", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    Saldo.saldoTotal=Saldo.saldoTotal+Integer.parseInt(depos);
                    depotext.setText("");
                    JOptionPane.showMessageDialog(null, "Su deposito fue agregado correctamente", "Deposito correcto", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}