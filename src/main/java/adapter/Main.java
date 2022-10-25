package adapter;

public class Main {
    public static void main(String[] args) {
        ContinentalDevice polishRadio = new ContinentalDevice() {
            @Override
            public void powerOnCT() {
                System.out.println("Muzyka gra");
            }
        };
        ContinentalSocket continentalSocket = new ContinentalSocket();
        System.out.println("Polish radio plugged into continental socket");
        continentalSocket.plugIn(polishRadio);
        UKDevice englishRadio = new UKDevice() {
            @Override
            public void powerOnUK() {
                System.out.println("Music is playing");
            }
        };
        UKSocket ukSocket = new UKSocket();
        System.out.println("English radio plugged into uk socket");
        ukSocket.plugIn(englishRadio);
        TwoWayAdapter twoWayAdapter = new TwoWayAdapter(polishRadio, englishRadio);
        System.out.println("English radio plugged into adapter and into ct socket");
        continentalSocket.plugIn(twoWayAdapter);
        System.out.println("Polish radio plugged into adapter and into uk socket");
        ukSocket.plugIn(twoWayAdapter);




    }
}
