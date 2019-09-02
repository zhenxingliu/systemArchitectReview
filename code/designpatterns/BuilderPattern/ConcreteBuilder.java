/**
 * ConcreteBuilder
 */
public class ConcreteBuilder extends Builder {


    private Computer computer = new Computer();

    @Override
    public void buildCPU() {
        computer.Add("组装CPU");
    }

    @Override
    public void buildMainboard() {
        computer.Add("组装主板");
    }

    @Override
    public void buildHD() {
        computer.Add("组装硬盘");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }

}