package w3resource.abstractquestion;

public class TestAbstractClass {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.sound();

        Animal tiger = new Tiger();
        tiger.sound();
    }
}
