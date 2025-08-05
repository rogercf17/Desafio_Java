import javax.swing.*;
import java.awt.*;

public class Desafio {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulário de Contato");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField(20);
        nomeField.setMaximumSize(new Dimension(300, 100));
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);
        emailField.setMaximumSize(new Dimension(300, 100));
        JLabel telLabel = new JLabel("Telefone:");
        JTextField telField = new JTextField(20);
        telField.setMaximumSize(new Dimension(300, 100));
        JLabel comentarioLabel = new JLabel("Comentário:");
        JTextArea comentarioArea = new JTextArea(5, 20);
        comentarioArea.setMaximumSize(new Dimension(300, 100));
        JLabel interesse = new JLabel("Tem interesse em AWS?");
        JRadioButton radioSim = new JRadioButton("Sim");
        JRadioButton radioNao = new JRadioButton("Não");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioSim);
        grupo.add(radioNao);
        JButton enviarButton = new JButton("Enviar");

        painel.add(nomeLabel);
        painel.add(nomeField);
        painel.add(emailLabel);
        painel.add(emailField);
        painel.add(telLabel);
        painel.add(telField);
        painel.add(comentarioLabel);
        painel.add(comentarioArea);
        painel.add(interesse);
        painel.add(radioSim);
        painel.add(radioNao);
        painel.add(enviarButton);

        enviarButton.addActionListener(e -> {
            String nome = nomeField.getText();
            String email = emailField.getText();
            String tel = telField.getText();
            String comentario = comentarioArea.getText();
            String opcao = radioSim.isSelected() ? "Sim" : (radioNao.isSelected() ? "Não" : "Nenhuma");

            System.out.println("Nome: " + nome);
            System.out.println("Email: " + email);
            System.out.println("Telefone: " + tel);
            System.out.println("Comentário: " + comentario);
            System.out.println("Tem interesse em AWS: " + opcao);
        });

        frame.add(painel);
        frame.setVisible(true);
    }
}
