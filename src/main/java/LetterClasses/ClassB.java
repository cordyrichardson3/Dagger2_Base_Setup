package LetterClasses;

import javax.inject.Inject;

public class ClassB {

    private ClassA classA;

    @Inject
    public ClassB(ClassA classA) {
        this.classA = classA;
    }

    @Override
    public String toString() {
        return "\nFrom class B: "
                + this.getClass().getSimpleName()
                + classA.toString();
    }
}
