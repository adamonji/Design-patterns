package memento;

import memento.smartApp.SmartApp;
import memento.smartApp.SmartAppCaretaker;

public class Main {
    public static void main(String[] args) {
        SmartAppCaretaker smartAppCaretaker = new SmartAppCaretaker();
        SmartApp smartApp = new SmartApp();
        smartApp.changeVersion(0.0);
        smartAppCaretaker.addMemento(smartApp.save());
        System.out.println("______________________________________________________");
        smartApp.changeVersion(1.0);
        smartAppCaretaker.addMemento(smartApp.save());
        System.out.println("______________________________________________________");
        smartApp.changeVersion(2.0);
        smartAppCaretaker.addMemento(smartApp.save());
        System.out.println("______________________________________________________");
        smartApp.changeVersion(3.0);
        smartAppCaretaker.addMemento(smartApp.save());
        System.out.println("______________________________________________________");
        smartApp.load(smartAppCaretaker.getMemento(0));
        System.out.println("______________________________________________________");
        smartApp.changeVersion(4.0);
        smartAppCaretaker.addMemento(smartApp.save());
        System.out.println("______________________________________________________");
        smartApp.load(smartAppCaretaker.getMemento(0));
        System.out.println("______________________________________________________");
        smartApp.load(smartAppCaretaker.getMemento(4));
        System.out.println("______________________________________________________");
    }
}
