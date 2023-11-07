public class Rytsyry extends Spartansy {
    private String horsemen;
    private String thoseWhoWalk;

    public Rytsyry(String name, int age, String massa, String horsemen, String thoseWhoWalk) {
        super(name, age, massa);
        this.horsemen = horsemen;
        this.thoseWhoWalk = thoseWhoWalk;
    }

    public String getHorsemen() {
        return horsemen;
    }

    public void setHorsemen(String horsemen) {
        this.horsemen = horsemen;
    }

    public String getThoseWhoWalk() {
        return thoseWhoWalk;
    }

    public void setThoseWhoWalk(String thoseWhoWalk) {
        this.thoseWhoWalk = thoseWhoWalk;
    }
}

