public class Cane extends Animal {

    public Cane(String nome, int eta, int peso, int velocita, int altezza, int larghezza, int numeroZampe, String colorePelo, String habitat) {
        super(nome, eta, velocita, peso, altezza, larghezza, numeroZampe, colorePelo, habitat);
    }

    @Override
    public String corri() {
        return getNome() + " sta correndo a " + getVelocita() + " km/h!";
    }

    @Override
    public String toString() {
        return "Cane{" +
                "nome='" + getNome() + '\'' +
                ", eta=" + getEta() +
                ", peso=" + getPeso() +
                ", velocita=" + getVelocita() +
                ", altezza=" + getAltezza() +
                ", larghezza=" + getLarghezza() +
                ", numeroZampe=" + getNumeroZampe() +
                ", colorePelo='" + getColorePelo() + '\'' +
                ", habitat='" + getHabitat() + '\'' +
                '}';
    }
}
