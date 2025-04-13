public class Persona {
    private String nome;
    private int eta;
    private String cognome;

    public Persona(String nome, int eta, String cognome) {
        this.nome = nome;
        this.eta = eta;
        this.cognome = cognome;
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

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", cognome='" + cognome + '\'' +
                '}';
    }
}

