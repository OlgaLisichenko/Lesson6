public class HDD {

    private String name;
    private String value;
    private String type;

    public HDD() {}

    public HDD(String name, String value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public String showHDDInformation() {
        return "\nHDD name: " + name + "; value: " + value + "; type: " + type;
    }
}
