public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Mario", 30);
        System.out.println("Nome: " + p.getNome());
        System.out.println("Eta: " + p.getEta());
        p.setNome("Luigi");
        p.setEta(25);
        System.out.println(  p.toString());



        Cane rex = new Cane("Rex", 5, 30, 25, 60, 20, 4, "marrone", "giardino");
        System.out.println(rex);
        System.out.println(rex.corri());  


    }
    
}
