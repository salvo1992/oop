public abstract class Animal implements Movimento {
    private String nome;
    private int eta;
    private int velocita;
    private int peso;
    private int altezza;
    private int larghezza;
    private int numeroZampe;
    private String colorePelo;
    private String habitat;

    public Animal(String nome, int eta, int velocita, int peso, int altezza, int larghezza, int numeroZampe, String colorePelo, String habitat) {
        this.nome = nome;
        this.eta = eta;
        this.velocita = velocita;
        this.peso = peso;
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.numeroZampe = numeroZampe;
        this.colorePelo = colorePelo;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getNumeroZampe() {
        return numeroZampe;
    }

    public void setNumeroZampe(int numeroZampe) {
        this.numeroZampe = numeroZampe;
    }

    public String getColorePelo() {
        return colorePelo;
    }

    public void setColorePelo(String colorePelo) {
        this.colorePelo = colorePelo;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", velocita=" + velocita +
                ", peso=" + peso +
                ", altezza=" + altezza +
                ", larghezza=" + larghezza +
                ", numeroZampe=" + numeroZampe +
                ", colorePelo='" + colorePelo + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }
    
}

