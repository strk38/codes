public class Test1 {public static void main(String [] args){

    Student1 s1 = new Student1("Bob", 1);
    Student1 s2 = new Student1("Tom", 2);
    Student1 s3 = new Student1("Jack", 3);
    Student1 s4 = new Student1("Jill", 4);
    Printer pr = new Printer();
    pr.printDetail(s1);
    pr.printDetail(s2);
    pr.printDetail(s3);
    pr.printDetail(s4);
}

}
