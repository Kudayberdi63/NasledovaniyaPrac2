public class Vsadniki extends Spartansy {
    private String fencers;
    private String level;

    public Vsadniki(String name, int age, String massa, String fencers, String level) {
        super(name, age, massa);
        this.fencers = fencers;
        this.level = level;
    }

    public String getFencers() {
        return fencers;
    }

    public void setFencers(String fencers) {
        this.fencers = fencers;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }


}
