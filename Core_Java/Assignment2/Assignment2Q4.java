abstract class AbstractCheck{
    public void CompletedMethod() {
        int val = 100;
        System.out.println(val);
    }
    public abstract void method1();
    public abstract int method2();
}

abstract class Abstract2{}

abstract class CheckExample extends AbstractCheck{}
public class Assignment2Q4 extends AbstractCheck {

    public static void main(String[] args) {
    }

    @Override
    public void method1() {
    }

    @Override
    public int method2() {
        return 0;
    }
}
