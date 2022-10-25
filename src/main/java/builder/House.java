package builder;

public class House {
    private String roof;
    private String floor;
    private String window;
    private String wall;
    private String door;

    private House(HouseBuilder houseBuilder) {
        this.door = houseBuilder.door;
        this.roof = houseBuilder.roof;
        this.window = houseBuilder.window;
        this.wall = houseBuilder.wall;
        this.floor = houseBuilder.floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "roof='" + roof + '\'' +
                ", floors='" + floor + '\'' +
                ", windows='" + window + '\'' +
                ", walls='" + wall + '\'' +
                ", doors='" + door + '\'' +
                '}';
    }

    public static class HouseBuilder {
        private String roof;
        private String floor;
        private String window;
        private String wall;
        private String door;


        public HouseBuilder buildRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder buildFloor(String floor) {
            this.floor = floor;
            return this;
        }

        public HouseBuilder buildWindow(String window) {
            this.window = window;
            return this;
        }

        public HouseBuilder buildWalls(String wall) {
            this.wall = wall;
            return this;
        }

        public HouseBuilder buildDoor(String door) {
            this.door = door;
            return this;
        }

        public House build() {
            return new House(this);
        }


    }
}
