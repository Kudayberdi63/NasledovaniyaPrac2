public class Luchniki extends Spartansy {
    private String height;
    private String weight;


    public Luchniki(String name, int age, String massa, String height, String weight) {
        super(name, age, massa);
        this.height = height;
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }



}
