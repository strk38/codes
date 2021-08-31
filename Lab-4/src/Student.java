public class Student {
    private String name;
    private String id;
    private String address;
    private double cgpa;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(String i){
        id=i;
    }
    public String getId(){
        return id;
    }
    public void setAddress(String a){
        address=a;
    }
    public String getAddress(){
        return address;
    }
    public void setCGPA(double c){
        cgpa=c;
    }
    public double getCGPA(){return cgpa;}

    public void printInfo()
    {
        System.out.println(getName()+ " " +  getId()+" "+getAddress()+" "+getCGPA());
    }



}
