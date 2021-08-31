public class Dog8 extends Animal8 implements SoundSource {
    public Dog8(String name){
        super(name);
    }
    public void makeSound(){
        System.out.println(getName()+" is crying.");
    }
}
