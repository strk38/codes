public class Dog extends  Animal {
    public Dog(String s){
        super(s);
    }

    @Override
    public String makeSound() {
        return sound;
    }
}
