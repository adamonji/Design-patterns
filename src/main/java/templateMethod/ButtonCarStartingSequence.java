package templateMethod;

public class ButtonCarStartingSequence {
    public void startTheCar()  {
        fastenSeatbelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void fastenSeatbelts() {
        System.out.println("Fasten seat belts");
    }

    private void startTheIgnition() {
        System.out.println("Press the button");
    }

    private void setTheGear() {
        System.out.println("Set the gear");
    }

    private void go() {
        System.out.println("Press the gas pedal");
    }

}
