package modules;

import LetterClasses.ClassE;
import dagger.Module;
import dagger.Provides;


@Module
public class ClassEModule {

    private ClassE classE;


    /*
    This is the analog to the ClassD setup (has empty primary constructor).
    Without a no-argument constructor, the generated component cannot build this object...
    so in Main, we create this module object via the component builder:
        builder.classEModule(new ClassEModule(new ClassE))
     */

    public ClassEModule(ClassE classE) {
        this.classE = classE;
    }

    @Provides
    public ClassE getE() {
        return classE;
    }

}
