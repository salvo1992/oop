public class Main {
  public static void main(String[] args) {
      // Creazione di un oggetto Persona
      Persona p = new Persona("Mario", 30, "Rossi");

      System.out.println("Nome: " + p.getNome());
      System.out.println("Età: " + p.getEta());
      System.out.println("Cognome: " + p.getCognome());

      // Modifica dei valori dell'oggetto Personaclear
      p.setNome("Luigi");
      p.setEta(25);
      p.setCognome("Verdi");

      System.out.println("Dopo le modifiche:");
      System.out.println("Nome: " + p.getNome());
      System.out.println("Età: " + p.getEta());
      System.out.println("Cognome: " + p.getCognome());
      
      @SuppressWarnings("unused")
      House h = new House.HouseBuilder("cemento", "legno", "blu", "tegole")
              .hasGarage(true)
              .hasGarden(true)
              .hasPool(false)
              .build();
      
      System.out.println(h.toString());
      
  }
}

