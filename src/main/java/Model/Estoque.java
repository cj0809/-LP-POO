package Model;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<Produto, Integer> produtos;

    public Estoque() {
        produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (produtos.containsKey(produto)) {
            produtos.put(produto, produtos.get(produto) + quantidade);
        } else {
            produtos.put(produto, quantidade);
        }
    }

    public void removerProduto(Produto produto, int quantidade) {
        if (produtos.containsKey(produto)) {
            int novaQuantidade = produtos.get(produto) - quantidade;
            if (novaQuantidade <= 0) {
                produtos.remove(produto);
            } else {
                produtos.put(produto, novaQuantidade);
            }
        }
    }

    public int verificarEstoque(Produto produto) {
        return produtos.getOrDefault(produto, 0);
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "produtos=" + produtos +
                '}';
    }
}
