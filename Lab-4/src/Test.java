public class Test {
    public static void main(String[]args) {
        Test5 t5 = new Test5();

        t5.methodA();
        Test5 t4 = new Test5(2, 3);
        t5.methodA();
        t5.methodA();
        t5.methodA();

//        Car myCar = new Car("Tesla" ,  "Red" );
//
//        System.out.println(myCar.getPrice());
//        myCar.setPrice(300000);
//
//        System.out.println(myCar.getPrice());
    }
}
