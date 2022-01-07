package staff;

public class Pilot extends Staff {

    private String pilotLicenceNum;

    public Pilot(String name, Rank rank, String pilotLicenceNum) {
        super(name, rank);
        this.pilotLicenceNum = pilotLicenceNum;
    }

    public String getPilotLicenceNum() {
        return pilotLicenceNum;
    }

    public void setPilotLicenceNum(String pilotLicenceNum) {
        this.pilotLicenceNum = pilotLicenceNum;
    }

    public String flyPlane() {
        return "Whoosh!";
    }
}
