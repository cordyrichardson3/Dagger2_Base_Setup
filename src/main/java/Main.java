import LetterClasses.ClassC;
import LetterClasses.ClassD;
import LetterClasses.ClassE;
import components.*;
import components.DaggerABCComponent;
import components.DaggerClassDComponent;
import modules.ClassEModule;


public class Main {
    public static void main (String[] args) {

        ABCComponent component = DaggerABCComponent.create();
        ClassC classC = component.getC();
        System.out.print(classC.toString());

        ClassDComponent componentD = DaggerClassDComponent.create();
        ClassD classD = componentD.getD();
        System.out.print(classD.toString());

        ClassEComponent componentE = DaggerClassEComponent.builder()
                .classEModule(new ClassEModule(new ClassE()))
                .build();

        ClassE classE = componentE.getE();
        System.out.println(classE.toString());
    }
}
