package components;

import LetterClasses.ClassE;
import dagger.Component;
import modules.ClassEModule;

@Component(modules = ClassEModule.class)
public interface ClassEComponent {
    ClassE getE();
}
