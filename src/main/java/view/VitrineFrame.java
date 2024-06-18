package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Carrinho;
import Model.Produto;

class CarrinhoFrame extends JFrame {
    private Carrinho carrinho;

    public CarrinhoFrame(Carrinho carrinho) {
        this.carrinho = this.carrinho;

        setTitle("Carrinho de Compras");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha apenas a janela do carrinho
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        getContentPane().add(panel);

        JLabel lblTitulo = new JLabel("Carrinho de Compras");
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(lblTitulo, BorderLayout.NORTH);

        JPanel produtosPanel = new JPanel();
        produtosPanel.setLayout(new BoxLayout(produtosPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(produtosPanel);
        panel.add(scrollPane, BorderLayout.CENTER);

        JButton btnFinalizarCompra = new JButton("Finalizar Compra");
        btnFinalizarCompra.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(btnFinalizarCompra, BorderLayout.SOUTH);

        btnFinalizarCompra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aqui você pode implementar a lógica para finalizar a compra
                JOptionPane.showMessageDialog(CarrinhoFrame.this, "Compra finalizada com sucesso!");
                dispose(); // Fecha a janela do carrinho após a compra
            }
        });

        // Exibir os produtos no carrinho
        for (Produto produto : this.carrinho.getProdutos()) {
            JLabel lblProduto = new JLabel(produto.getNome() + " - R$ " + produto.getPreco());
            lblProduto.setAlignmentX(Component.CENTER_ALIGNMENT);
            produtosPanel.add(lblProduto);
        }
    }

    public void mostrarCarrinho() {
    }
}
