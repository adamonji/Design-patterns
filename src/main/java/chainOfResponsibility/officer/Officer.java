package chainOfResponsibility.officer;

import chainOfResponsibility.message.Message;

public abstract class Officer {

    private Officer superiorOfficer;

    public abstract void processMessage(Message message);

    public void setSuperiorOfficer(Officer superiorOfficer) {
        this.superiorOfficer = superiorOfficer;
    }

    public Officer getSuperiorOfficer() {
        return superiorOfficer;
    }
}
