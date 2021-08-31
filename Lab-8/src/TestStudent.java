public class TestStudent {
    public static void printName(Student s){
    System.out.println(s.toString());
}
    public static void main(String [] args){
        printName(new BbaStudent());
        printName(new BbaStudent("Humty Dumty"));
        printName(new BbaStudent("Little Bo Peep"));
    }

}
