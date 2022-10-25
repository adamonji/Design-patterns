package templateMethod;

public abstract class CarStartingSequence {
    public final void startTheCar()  {
        fastenSeatbelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void fastenSeatbelts() {
        System.out.println("Fasten seat belts");
    }

    private void go() {
        System.out.println("Press the gas pedal");
    }

    public abstract void startTheIgnition();
    public abstract void setTheGear();

}

