/**
 * PrototypePatternDemo
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {

        MathHomework xueba  = new MathHomework();

        MathHomework xuezha = xueba.clone();

        xuezha.show();
    }
}