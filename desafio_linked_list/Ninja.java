package desafio_linked_list;

public class Ninja {

    private final String nome;
    private final String vila;
    private final int idade;

    public Ninja(String nome, String vila, int idade) {
        this.nome = nome;
        this.vila = vila;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getVila() {
        return vila;
    }

    public int getIdade() {
        return idade;
    }



    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", vila='" + vila + '\'' +
                ", idade=" + idade +
                '}';
    }

}
