public class Persona {
   private String nome;
    private int età;
    private String cognome;


        // Metodi getter e setter
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public int getEtà() {
            return età;
        }
    
        public void setEtà(int età) {
            this.età = età;
        }
        
        public String getCognome() {
            return cognome;
        }
    
        public void setCognome(String cognome) {
            this.cognome = cognome;
        }
        // Costruttore
        public Persona(String nome, int età , String cognome) {
            this.nome = nome;
            this.età = età;
            this.cognome = cognome;
    }
}
