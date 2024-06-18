package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Carrinho;
import Model.Produto;

class VitrineFrame extends JFrame {
    private Carrinho carrinho;

    public VitrineFrame(Carrinho carrinho) {
        this.carrinho = this.carrinho;

        setTitle("Vitrine de Produtos - Cruzeiro Esporte Clube");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Alterado para fechar apenas a janela da vitrine
        setLocationRelativeTo(null); // Centraliza a janela na tela

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(173, 216, 230)); // Define a cor azul
                g.fillRect(0, 0, getWidth(), getHeight()); // Preenche o painel com a cor azul
            }
        };
        getContentPane().add(panel);
        panel.setLayout(new BorderLayout());

        JLabel lblTitulo = new JLabel("Vitrine de Produtos - Cruzeiro Esporte Clube");
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(lblTitulo, BorderLayout.NORTH);

        JPanel produtosPanel = new JPanel();
        produtosPanel.setLayout(new BoxLayout(produtosPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(produtosPanel);
        panel.add(scrollPane, BorderLayout.CENTER);

        Produto[] produtos = {
                new Produto("Camisa do Cruzeiro 1", 150.00, "6x1"),
                new Produto("Camisa do Cruzeiro 2", 170.00, "6x1"),
                new Produto("Camisa do Cruzeiro 3", 160.00, "6x1")
        };

        for (Produto produto : produtos) {
            final Produto produtoFinal = produto; // Captura final da variável produto
            JButton botaoProduto = new JButton(produto.getNome() + " - R$ " + produto.getPreco() + " - Número: " + produto.getNumero());
            botaoProduto.setAlignmentX(Component.CENTER_ALIGNMENT);
            produtosPanel.add(botaoProduto);

            botaoProduto.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    VitrineFrame.this.carrinho.adicionarProduto(produtoFinal); // Usamos a variável produtoFinal aqui
                    JOptionPane.showMessageDialog(VitrineFrame.this, produtoFinal.getNome() + " adicionado ao carrinho.");
                }
            });
        }
    }

    public void mostrarVitrine() {
    }
}
