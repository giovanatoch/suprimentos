public class Suprimentos {
    private int numeroItem;
    private String descricaoItem;
    private int quantidade;
    private double precoUnitario;

    // Construtor
    public Suprimentos(int numeroItem, String descricaoItem, int quantidade, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
        if (precoUnitario > 0.0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario > 0.0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double getInvoiceAmount() {
        return quantidade * precoUnitario;
    }

    public static void main(String[] args) {
        Suprimentos suprimento = new Suprimentos(1, "Teclado", 2, 25.0);

        System.out.println("Número do Item: " + suprimento.getNumeroItem());
        System.out.println("Descrição do Item: " + suprimento.getDescricaoItem());
        System.out.println("Quantidade: " + suprimento.getQuantidade());
        System.out.println("Preço Unitário: " + suprimento.getPrecoUnitario());
        System.out.println("Valor da Fatura: " + suprimento.getInvoiceAmount());
    }
}
