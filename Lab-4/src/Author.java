public class Author {
   private String firstname;
    private String lastname;

    public Author(String firstname,String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
    }
    public void setFirstName (String firstName){
        firstname=firstName;
    }
    public void setLastName (String lastName){
        lastname=lastName;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public String toString(){
        return firstname+lastname;
    }
}
