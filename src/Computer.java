public class Computer {

    private double cost;
    private String model;
    private RAM ram;
    private HDD hdd;

    public Computer() {}

    public Computer(double cost, String model) {
        ram = new RAM();
        hdd = new HDD();
        this.cost = cost;
        this.model = model;
    }

    public Computer(double cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String showComputerInformation() {
        return "\nComputer cost: " + cost + "; model: " + model + ram.showRAMInformation() + hdd.showHDDInformation();
    }
}
