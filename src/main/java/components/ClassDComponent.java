package components;

import LetterClasses.ClassD;
import dagger.Component;
import modules.ClassDModule;

@Component(modules = ClassDModule.class)
public interface ClassDComponent {
    ClassD getD();
}
