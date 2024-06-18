package view;

import javax.swing.*;
import java.awt.*;

public class PagamentoFrame extends JFrame {
    public PagamentoFrame() {
        setTitle("Pagamento");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblTitulo = new JLabel("Informações de Pagamento");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setBounds(100, 20, 250, 30);
        panel.add(lblTitulo);

        JLabel lblNome = new JLabel("Nome no Cartão:");
        lblNome.setBounds(50, 70, 120, 25);
        panel.add(lblNome);

        JTextField textFieldNome = new JTextField();
        textFieldNome.setBounds(180, 70, 150, 25);
        panel.add(textFieldNome);

        JLabel lblNumeroCartao = new JLabel("Número do Cartão:");
        lblNumeroCartao.setBounds(50, 110, 120, 25);
        panel.add(lblNumeroCartao);

        JTextField textFieldNumeroCartao = new JTextField();
        textFieldNumeroCartao.setBounds(180, 110, 150, 25);
        panel.add(textFieldNumeroCartao);

        JLabel lblDataValidade = new JLabel("Data de Validade:");
        lblDataValidade.setBounds(50, 150, 120, 25);
        panel.add(lblDataValidade);

        JTextField textFieldDataValidade = new JTextField();
        textFieldDataValidade.setBounds(180, 150, 100, 25);
        panel.add(textFieldDataValidade);

        JLabel lblCodigoSeguranca = new JLabel("Código de Segurança:");
        lblCodigoSeguranca.setBounds(50, 190, 150, 25);
        panel.add(lblCodigoSeguranca);

        JPasswordField passwordFieldCodigoSeguranca = new JPasswordField();
        passwordFieldCodigoSeguranca.setBounds(200, 190, 80, 25);
        panel.add(passwordFieldCodigoSeguranca);

        JButton btnPagar = new JButton("Pagar");
        btnPagar.setBounds(150, 240, 100, 30);
        panel.add(btnPagar);
    }

    public void mostrarPagamento() {
        setVisible(true);
    }
}
