package hw1.mykhaylo_osadtsiv.composition;

public class Engine {
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + getType() + '\'' +
                '}';
    }
}
