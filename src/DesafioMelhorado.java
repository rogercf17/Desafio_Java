import javax.swing.*;
import java.awt.*;

public class DesafioMelhorado {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch (Exception e) {
            System.out.println(e + " Tema padrão será usado.");
        }

        JFrame frame = new JFrame("Formulário de Contato");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JTextField nomeField = criaCampo(panel, "Nome:");
        JTextField emailField = criaCampo(panel, "Email:");
        JTextField telField = criaCampo(panel, "Telefone:");

        panel.add(new JLabel("Comentário:"));
        JTextArea comentarioArea = new JTextArea(5, 20);
        comentarioArea.setLineWrap(true);
        comentarioArea.setWrapStyleWord(true);
        comentarioArea.setMaximumSize(new Dimension(300, 100));
        panel.add(new JScrollPane(comentarioArea));

        panel.add(new JLabel("Tem interesse em AWS?"));
        JRadioButton radioSim = new JRadioButton("Sim");
        JRadioButton radioNao = new JRadioButton("Não");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioSim);
        grupo.add(radioNao);
        panel.add(radioSim);
        panel.add(radioNao);

        JButton buttonEnviar = new JButton("Enviar");
        buttonEnviar.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonEnviar.addActionListener(e -> {
            String opcao = radioSim.isSelected() ? "Sim" : (radioNao.isSelected() ? "Não" : "Nenhuma");
            System.out.println("Nome: " + nomeField.getText());
            System.out.println("Email: " + emailField.getText());
            System.out.println("Telefone: " + telField.getText());
            System.out.println("Comentário: " + comentarioArea.getText());
            System.out.println("Tem interesse em AWS: " + opcao);
        });
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(buttonEnviar);

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static JTextField criaCampo(JPanel panel, String label) {
        panel.add(new JLabel(label));
        JTextField campo = new JTextField(20);
        campo.setMaximumSize(new Dimension(300, 30));
        panel.add(campo);
        return campo;
    }
}
