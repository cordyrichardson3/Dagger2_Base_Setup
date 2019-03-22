public class Main {
    public static void main (String[] args) {

        AlphabetClassComponent component = DaggerAlphabetClassComponent.create();
        ClassC classC = component.getC();

        System.out.print(classC.toString());
    }
}
