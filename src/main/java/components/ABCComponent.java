package components;

import LetterClasses.ClassC;
import dagger.Component;

@Component
public interface ABCComponent {
    ClassC getC();
}
