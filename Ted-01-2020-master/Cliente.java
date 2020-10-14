package app2;

public class Cliente {
    
    private String idCliente;
    private String nome;
    
    //Metodos

    public Cliente(String idCliente, String nome) {
        this.idCliente = idCliente;
        this.nome = nome;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nome=" + nome + '}';
    }
    
    // Get & Set

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
 
}
