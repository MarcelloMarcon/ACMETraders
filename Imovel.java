public class Imovel {
    private String nome;
    private int metrosQuadrados;
    private int vagasDeGaragem;
    private Participante participante;

    public Imovel() {
    }

    public Imovel(String nome, int metrosQuadrados, int vagasDeGaragem, Participante participante) {
        this.nome = nome;
        this.metrosQuadrados = metrosQuadrados;
        this.vagasDeGaragem = vagasDeGaragem;
        this.participante = participante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMetrosQuadrados() {
        return metrosQuadrados;
    }

    public void setMetrosQuadrados(int metrosQuadrados) {
        this.metrosQuadrados = metrosQuadrados;
    }

    public int getVagasDeGaragem() {
        return vagasDeGaragem;
    }

    public void setVagasDeGaragem(int vagasDeGaragem) {
        this.vagasDeGaragem = vagasDeGaragem;
    }

    public Participante getParticipante() { return participante;}

    public void setParticipante(Participante participante) { this.participante = participante;}

    @Override
    public String toString() {
        return "Imovel{" +
                "nome='" + nome + '\'' +
                ", metrosQuadrados=" + metrosQuadrados +
                ", vagasDeGaragem=" + vagasDeGaragem +
                ", proprietário=" + participante.getEmail() +
                '}';
    }
}
