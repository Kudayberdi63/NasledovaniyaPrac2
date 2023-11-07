public class Spartansy {
    private String name;
    private int age;
    private String massa;

    public Spartansy(String name, int age, String massa) {
        this.name = name;
        this.age = age;
        this.massa = massa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + massa;
    }
}
