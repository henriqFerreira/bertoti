import java.util.HashMap;

public class Emprestimo {
    private double valor;
    private String documento;
    private int parcelas;
    private double taxaPorParcela;
    private HashMap<Integer, Double> valorParcelas;

    public Emprestimo(double valor, String documento, int parcelas) {
        this.valor = valor;
        this.documento = documento;
        this.parcelas = parcelas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public double getTaxaPorParcela() {
        return taxaPorParcela;
    }

    public void setTaxaPorParcela(double taxaPorParcela) {
        this.taxaPorParcela = taxaPorParcela;
    }

    public HashMap<Integer, Double> getValorParcelas() {
        return valorParcelas;
    }

    public void setValorParcelas(HashMap<Integer, Double> valorParcelas) {
        this.valorParcelas = valorParcelas;
    }
}
