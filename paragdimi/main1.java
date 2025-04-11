public class main1 {
    
    public static void main(String[] args) {
        // Creazione di un oggetto Persona
        Persona p = new Persona("Mario", 30 , "Rossi");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Eta: " + p.getEta());
        System.out.println("Cognome: " + p.getCognome());
        

        // Modifica dei valori dell'oggetto Persona
        p.setNome("Luigi");
        p.setEta(25);
        p.setCognome("Verdi");
        System.out.println(p.toString());

          
    }
    
}
