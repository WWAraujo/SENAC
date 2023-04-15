package atividade;

import java.math.BigDecimal;

public class ItemPedido {

    private Double total;

    private Produto produto;
    public ItemPedido(Produto produto) {


        this.total = produto.getPreco() * produto.getCodigo();
        this.produto = produto;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
