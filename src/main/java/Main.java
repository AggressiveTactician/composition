public class Main {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        Computer PC = factory.createComputer("i5 9600k", "2070S", "CTG 750C");
        System.out.println(PC.description());
    }
}