package view;

import Model.Carrinho;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Carrinho carrinho = new Carrinho();

                VitrineFrame vitrineFrame = new VitrineFrame(carrinho);
                vitrineFrame.setVisible(true);

                vitrineFrame.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                        LoginFrame loginFrame = new LoginFrame();
                        loginFrame.setVisible(true);

                        loginFrame.addWindowListener(new java.awt.event.WindowAdapter() {
                            @Override
                            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                                if (loginFrame.isLoginSuccessful()) {
                                    // Exibe a tela de carrinho de compras
                                    CarrinhoFrame carrinhoFrame = new CarrinhoFrame(carrinho);
                                    carrinhoFrame.setVisible(true);

                                    carrinhoFrame.addWindowListener(new java.awt.event.WindowAdapter() {
                                        @Override
                                        public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                                            PagamentoFrame pagamentoFrame = new PagamentoFrame();
                                            pagamentoFrame.setVisible(true);
                                        }
                                    });
                                }
                            }
                        });
                    }
                });
            }
        });
    }
}
