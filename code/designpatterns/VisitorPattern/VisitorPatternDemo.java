public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer1();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}