public class Tester {
    public static void main(String[] args) {
        System.out.println("---");
        Object [] a1={2,4,5,7,4,8,9};
        Assignment L1=new Assignment(a1);
        L1.EvenNum();

        System.out.println("===");
        L1.Array(8);
        //L1.PrintList();
    }
}
