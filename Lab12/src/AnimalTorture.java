
public class AnimalTorture {

    private void hugAnimal(SoundSource a){
        a.makeSound();
    }

    public static void main(String[] args) {
        Dog8 d = new Dog8("Rover");
        AnimalTorture at = new AnimalTorture();
        at.hugAnimal(d);
    }
}
