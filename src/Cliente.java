public class Cliente {
    private String nome;
    private boolean status;
    private int compras;

    public Cliente(String nome, boolean status, int compras) {
        this.nome = nome;
        this.status = status;
        this.compras = compras;
    }

    public String getNome() {

        return this.nome;
    }

    public boolean getStatus() {

        return this.status;
    }

    public int getCompras() {
        return this.compras;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", status=" + status +
                ", compras=" + compras +
                '}';
    }
}
