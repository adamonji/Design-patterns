package adapter;

public class TwoWayAdapter implements ContinentalDevice, UKDevice{
    ContinentalDevice continentalDevice;
    UKDevice ukDevice;

    public TwoWayAdapter(ContinentalDevice continentalDevice, UKDevice ukDevice) {
        this.continentalDevice = continentalDevice;
        this.ukDevice = ukDevice;
    }

    @Override
    public void powerOnCT() {
        ukDevice.powerOnUK();
    }

    @Override
    public void powerOnUK() {
        continentalDevice.powerOnCT();
    }
}
