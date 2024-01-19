package interfaceeg;

public class Cat implements PetExample{

    @Override
    public void eat() {
        System.out.println("Cat eats CatFood");
    }

    @Override
    public void voice() {
      System.out.println("Meow Gyi");

    }

    @Override
    public void play() {
       System.out.println("Playing at Roof");
    }
    
}
