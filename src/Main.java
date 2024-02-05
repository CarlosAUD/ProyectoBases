import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("EL BUEN BUHO");
        frame.setUndecorated(true);
        frame.setContentPane(new Bienvenida().bienvenido);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,350);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}