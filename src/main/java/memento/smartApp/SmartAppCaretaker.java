package memento.smartApp;

import java.util.ArrayList;
import java.util.List;

public class SmartAppCaretaker {
    private List<SmartAppMemento> mementos = new ArrayList<>();
    public void addMemento(SmartAppMemento smartAppMemento)  {
        mementos.add(smartAppMemento);
        System.out.println("Saved version: " + smartAppMemento.getVersion() + " is on index: " + (mementos.size() - 1));

    }
    public SmartAppMemento getMemento(int index)  {
        System.out.println("Loaded version: " + mementos.get(index).getVersion());
        return mementos.get(index);
    }
}
