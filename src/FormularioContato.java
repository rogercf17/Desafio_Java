import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormularioContato {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulário de Contato");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField(20);

        JLabel comentarioLabel = new JLabel("Comentário:");
        JTextArea comentarioArea = new JTextArea(5, 20);

        JCheckBox interesseAWS = new JCheckBox("Tem interesse em AWS?");
        JRadioButton radioSim = new JRadioButton("Sim");
        JRadioButton radioNao = new JRadioButton("Não");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioSim);
        grupo.add(radioNao);

        JButton enviarButton = new JButton("Enviar");

        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(comentarioLabel);
        panel.add(comentarioArea);
        panel.add(interesseAWS);
        panel.add(radioSim);
        panel.add(radioNao);
        panel.add(enviarButton);

        enviarButton.addActionListener(e -> {
            String nome = nomeField.getText();
            String comentario = comentarioArea.getText();
            String interesse = interesseAWS.isSelected() ? "Sim" : "Não";
            String opcao = radioSim.isSelected() ? "Sim" : (radioNao.isSelected() ? "Não" : "Nenhuma");

            System.out.println("Nome: " + nome);
            System.out.println("Comentário: " + comentario);
            System.out.println("Interesse em AWS: " + interesse);
            System.out.println("Resposta: " + opcao);
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
