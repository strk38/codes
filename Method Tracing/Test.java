public class Test{
  public static void main(String[]args){
//    Test5 t5 = new Test5(); 
//    t5.methodA();
//    Test5 t4 = new Test5(2,3);
//    t5.methodA();
//    t5.methodA();
//    t5.methodA();
    Gandalf var1 = new Frodo();
    Gandalf var2 = new Bilbo();
    Gandalf var3 = new Gandalf();
    Object var4 = new Bilbo();
    Bilbo var5 = new Frodo();
    Object var6 = new Gollum();
    var1.method1();              
    var2.method1();               
//var4.method1();              
//var6.method1();              
    var1.method2();              
    var3.method2();              
//var4.method2();              
    var5.method2();              
//var6.method2();              
    //runtime error ((Frodo)var4).method3();     
    //re ((Frodo)var6).method2();   
    //re ((Gollum)var1).method3();   
    //re ((Gollum)var4).method1();     
    //??((Gandalf)var1).method2();   
    //re ((Frodo)var4).method1();     
    //((Gollum)var6).method2();   
    //((Gandalf)var2).method1();   
    //((Bilbo)var6).method2();     
    ((Frodo)var1).method3();     
//((Gandalf)var5).method3();
    
  }
}
