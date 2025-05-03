public class House {
    private String foundation;
    private String structure;
    private String roof;
    private String color;
    private boolean hasGarage;
    private boolean hasGarden;
    private boolean hasPool;

    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.color = builder.color;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.hasPool = builder.hasPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", color='" + color + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasGarden=" + hasGarden +
                ", hasPool=" + hasPool +
                '}';
    }

    public static class HouseBuilder {
        private String foundation;
        private String structure;
        private String roof;
        private String color;
        private boolean hasGarage;
        private boolean hasGarden;
        private boolean hasPool;

        public HouseBuilder(String foundation, String structure, String color, String roof) {
            this.foundation = foundation;
            this.structure = structure;
            this.color = color;
            this.roof = roof;
        }

        public HouseBuilder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder hasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public HouseBuilder hasPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}

