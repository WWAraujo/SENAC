package atividade;

import java.math.BigDecimal;

public class ItemPedido {

    private int qtd;

    private BigDecimal valorUnitatio;

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public BigDecimal getValorUnitatio() {
        return valorUnitatio;
    }

    public void setValorUnitatio(BigDecimal valorUnitatio) {
        this.valorUnitatio = valorUnitatio;
    }
}
