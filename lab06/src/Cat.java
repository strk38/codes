public class Cat{ 
  public String color = "White"; 
  public String action = "sitting"; 

  Cat(){
  }
  Cat(String color){
    this.color=color;
  }
  Cat(String color,String action){
    this.color=color;
    this.action=action;
  }
  public void changeColor(String color){
    this.color=color;
    
  }
  public void printCat(){
    System.out.println(color+" cat is "+action);
  }
  
} 
