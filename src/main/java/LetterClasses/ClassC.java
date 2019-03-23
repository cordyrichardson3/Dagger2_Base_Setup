package LetterClasses;

import javax.inject.Inject;

public class ClassC {
/*
Class C has dependencies to Class a and Class B
 */
    private ClassB classB;

    @Inject
    public ClassC(ClassB classB) {
        this.classB = classB;
    }

    @Override
    public String toString() {
        return "\nFrom class C: "
                +this.getClass().getSimpleName()
                + classB.toString();
    }
}
