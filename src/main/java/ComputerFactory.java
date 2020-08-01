public class ComputerFactory {
    public Computer createComputer(String CPUname, String GPUname, String PSUname) {
        Computer PC = new Computer(CPUname, GPUname, PSUname);
        return new Computer(CPUname, GPUname, PSUname);
    }
}