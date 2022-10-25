package builder;

public class Main {
    public static void main(String[] args) {
        House house125 = new House.HouseBuilder()
                .buildDoor("Doors")
                .buildFloor("Floor")
                .buildRoof("Roof")
                .buildWalls("Wall")
                .buildWindow("Window")
                .build();

        System.out.println(house125);
    }
}
