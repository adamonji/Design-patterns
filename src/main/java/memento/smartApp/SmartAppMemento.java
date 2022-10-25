package memento.smartApp;

class SmartAppMemento {
    private Double version;

    SmartAppMemento(Double version) {
        this.version = version;
    }

    public Double getVersion() {
        return version;
    }
}
