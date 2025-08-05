import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha Primeira Interaface - DDD");
        JButton button = new JButton("Clique aqui");

        button.addActionListener(e -> JOptionPane.showMessageDialog(null, "Você clicou!"));

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}