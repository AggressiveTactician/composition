public class Main {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        Computer PC = factory.createComputer("CPU", "GPU", "PSU");
        System.out.println(PC.description());
    }
}