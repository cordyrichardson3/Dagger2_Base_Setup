package modules;


import LetterClasses.ClassD;
import dagger.Module;
import dagger.Provides;

@Module
public class ClassDModule {

    /*
    Empty constructor allows the generated component to create this object and allow a component.create method
     */

    @Provides
    public ClassD getClassD() {
        return new ClassD();
    }

}
