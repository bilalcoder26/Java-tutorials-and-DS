package w3resource.abstractquestion;

abstract class Animal {
    public abstract void sound();
}

class Lion extends Animal{

    @Override
    public void sound() {
        System.out.println("lion roars");
    }
}

class Tiger extends Animal{

    @Override
    public void sound() {
        System.out.println("tiger growls");
    }
}

