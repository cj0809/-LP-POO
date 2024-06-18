package Model;

import java.util.Date;
import java.util.List;

public class Venda {
    private int id;
    private Vendedor vendedor;
    private Cliente cliente;
    private List<ItemVenda> itens;
    private Date dataVenda;
    private double total;

    public Venda() {
    }

    public Venda(int id, Vendedor vendedor, Cliente cliente, List<ItemVenda> itens, Date dataVenda) {
        this.id = id;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.itens = itens;
        this.dataVenda = dataVenda;
        this.total = calcularTotal();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
        this.total = calcularTotal();
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getTotal() {
        return total;
    }

    private double calcularTotal() {
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", vendedor=" + vendedor +
                ", cliente=" + cliente +
                ", itens=" + itens +
                ", dataVenda=" + dataVenda +
                ", total=" + total +
                '}';
    }
}
