public class RAM {

    private String name;
    private String value;

    public RAM() {}

    public RAM(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String showRAMInformation() {
        return "\nRAM name: " + name + "; value: " + value;
    }
}
