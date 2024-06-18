package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JTextField textFieldEmail;
    private JPasswordField passwordFieldSenha;

    public LoginFrame() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(0, 102, 204)); // Define a cor azul
                g.fillRect(0, 0, getWidth(), getHeight()); // Preenche o painel com a cor azul
            }
        };
        getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setForeground(Color.WHITE); // Define a cor do texto como branca
        lblEmail.setBounds(30, 30, 80, 25);
        panel.add(lblEmail);

        textFieldEmail = new JTextField();
        textFieldEmail.setBounds(120, 30, 150, 25);
        panel.add(textFieldEmail);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setForeground(Color.WHITE); // Define a cor do texto como branca
        lblSenha.setBounds(30, 70, 80, 25);
        panel.add(lblSenha);

        passwordFieldSenha = new JPasswordField();
        passwordFieldSenha.setBounds(120, 70, 150, 25);
        panel.add(passwordFieldSenha);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(120, 110, 80, 25);
        panel.add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                autenticarUsuario();
            }
        });
    }

    private void autenticarUsuario() {
        String email = textFieldEmail.getText();
        String senha = new String(passwordFieldSenha.getPassword());

        if (email.equals("Cruzeiro") && senha.equals("meurivalvence")) {
            JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
            dispose(); // Fecha a janela de login após o login bem-sucedido
        } else {
            JOptionPane.showMessageDialog(this, "Credenciais inválidas. Por favor, tente novamente.");
        }
    }

    public void mostrarLogin() {
        setVisible(true);
    }

    public boolean isLoginSuccessful() {
        return false;
    }
}
