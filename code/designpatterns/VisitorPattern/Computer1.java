public class Computer1 implements ComputerPart {

    ComputerPart[] parts;

    public Computer1() {
        parts = new ComputerPart[] { new Mouse(), new Keyboard(), new Monitor() };
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}