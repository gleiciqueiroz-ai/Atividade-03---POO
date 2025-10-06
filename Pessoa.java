public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public Pessoa() { }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}