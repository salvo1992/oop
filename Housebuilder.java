public class Housebuilder {
    private String foundation;
    private String structure;
    private String color;
    private boolean hasGarage;
    private boolean hasGarden;
    private boolean hasPool;
    private String roof;

    public Housebuilder(String foundation, String structure ,String color , String roof) {
        this.foundation = foundation;
        this.structure = structure;
        this.color = color;
        this.roof = roof;
}
        public House build() {
            return new House(this);
        }
        
     
    
}
