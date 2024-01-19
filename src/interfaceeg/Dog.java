package interfaceeg;

public class Dog implements PetExample {

    @Override
    public void eat() {
        System.out.println("Dog eats Bone");
    }

    @Override
    public void voice() {
    System.out.println(" Woof Woof");
    }

    @Override
    public void play() {
        System.out.println("Playing at park");
    }
    
}
