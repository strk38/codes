public class Cat extends  Animal {
    public Cat(String sounds){
        super(sounds);
    }

    @Override
    public String makeSound() {
        return sound;
    }
}
