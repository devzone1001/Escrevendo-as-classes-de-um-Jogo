public class Heroi {
    // Propriedades da classe
    private String nome;
    private int idade;
    private String tipo;

    // Construtor da classe
    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    // Método para realizar o ataque
    public void atacar() {
        String ataque;

        // Decisão baseada no tipo de herói
        switch (tipo.toLowerCase()) {
            case "mago":
                ataque = "magia";
                break;
            case "guerreiro":
                ataque = "espada";
                break;
            case "monge":
                ataque = "artes marciais";
                break;
            case "ninja":
                ataque = "shuriken";
                break;
            default:
                ataque = "ataque desconhecido";
                break;
        }

        // Exibindo a mensagem de ataque
        System.out.println("O " + tipo + " atacou usando " + ataque);
    }

    // Métodos getters e setters (opcional, mas útil)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Heroi mago = new Heroi("Gandalf", 1000, "mago");
        Heroi guerreiro = new Heroi("Aragorn", 35, "guerreiro");
        Heroi monge = new Heroi("Shaolin", 45, "monge");
        Heroi ninja = new Heroi("Naruto", 20, "ninja");

        mago.atacar();        // Saída: O mago atacou usando magia
        guerreiro.atacar();   // Saída: O guerreiro atacou usando espada
        monge.atacar();       // Saída: O monge atacou usando artes marciais
        ninja.atacar();       // Saída: O ninja atacou usando shuriken
    }
}
