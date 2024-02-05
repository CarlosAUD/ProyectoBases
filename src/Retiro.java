import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Retiro {
    public JPanel retir;
    private JTextField retitext;
    private JButton a1Button;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0But;
    private JButton ingresarButton;
    private JButton MENUButton;
    private JButton eli;

    public Retiro() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"9");
            }
        });
        a0But.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"0");
            }
        });
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String reti = retitext.getText();
                if (reti.isEmpty() || reti.equals("0")){
                    JOptionPane.showMessageDialog(null, "Ingrese un valor", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    if (Saldo.saldoTotal<Integer.parseInt(reti)){
                        JOptionPane.showMessageDialog(null, "No tiene suficiente saldo", "Error", JOptionPane.INFORMATION_MESSAGE);
                        retitext.setText("");
                    }else{
                        Saldo.saldoTotal=Saldo.saldoTotal-Integer.parseInt(reti);
                        retitext.setText("");
                        JOptionPane.showMessageDialog(null, "Su retiro fue exitoso", "Retiro exitoso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

            }
        });
        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(MENUButton);
                frame.dispose();
                JFrame frames = new JFrame("QUE TRANSACCION VA A REALIZAR");
                frames.setUndecorated(true);
                frames.setContentPane(new Transaccion().transaccion);
                frames.setSize(400,350);
                frames.setLocationRelativeTo(null);
                frames.setVisible(true);
            }
        });
        eli.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String clave= retitext.getText();
                retitext.setText("");
                for (int i=1;i<clave.length();i++){
                    retitext.setText(retitext.getText()+clave.charAt(i-1));
                }
            }
        });
    }
}
