public class Computer {
    private CPU cpu;
    private GPU gpu;
    private PSU psu;

    public Computer(String cpu, String gpu, String psu) {
        this.cpu = new CPU(cpu);
        this.gpu = new GPU(gpu);
        this.psu = new PSU(psu);
    }

    public String description() {
        return toString();
    }

    public CPU getCpu() {
        return cpu;
    }

    public GPU getGpu() {
        return gpu;
    }

    public PSU getPsu() {
        return psu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", gpu=" + gpu +
                ", psu=" + psu +
                '}';
    }
}