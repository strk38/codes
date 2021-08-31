public class Student{
  private String name="Ei name e kono student nai";
  private String address="Naam nai .. thikana ashbe koi theke?";
  private String id="Student ei nai, abar id :P";
  private double cgpa=-4.0;
  
  Student(){}
  Student(String name, String id, String address, double cgpa){
    this.name= name;
    this.id= id;
    this.address= address;
    this.cgpa= cgpa;
  }
  
  public String nameDao(){
    return name;
  }
  public String boloToAmiKe(){
    return id;
  }
  public String addressDao(){
    return address;
  }
  public double cgpaDao(){
    return cgpa;
  }
  public void nameBoshao(String name){
    this.name= name;
  }
  public void addressBoshao(String address){
    this.address= address;
  }
  public void idBoshao(String id){
   this.id= id;
  }
  public void cgpaBoshao(double cgpa){
    this.cgpa= cgpa;
  }
  
  public void standUp(){
  System.out.println(name+" is standing up!!");
  }
  public String tellMeYourName(){
    return"Sir, my name is "+name;
  }
  public void call(String _name){
  System.out.println(name+": hey, "+_name+" Sir is calling you!!");
  }
  public int add2Numbers(int a,int b){
  return a+b;
  }

  
  
}

