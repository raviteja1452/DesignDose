package tollManagement.entities;

public class TollBooth {
    private String tollAddress;
    private String tollId;
    private String tollName;
    private String tollLeader;

    public TollBooth(String tollId, String tollName, String tollLeader, String tollAddress) {
        this.tollId = tollId;
        this.tollName = tollName;
        this.tollAddress = tollAddress;
        this.tollLeader = tollLeader;
    }

    public String getTollAddress() {
        return this.tollAddress;
    }

    public String getTollName() {
        return this.tollName;
    }

    public void setTollName(String tollName) {
        // validation: if name is meeting the criterias.
        this.tollName = tollName;
    }

}
