import javax.inject.Inject;

public class ClassA {

    @Inject
    public ClassA(){}

    @Override
    public String toString() {
        return "\nFrom class A: " + this.getClass().getSimpleName();
    }
}
