public class Stomach extends Organ{
    private boolean isEmpty;

    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    @Override
    public void details() {
        super.details();

        if(this.isEmpty()){
            System.out.println("Needs to be fed");
        }
        else{
            System.out.println("Stomach is full");
        }
    }

    public void digest(){
        System.out.println("Digestion begins...");
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
