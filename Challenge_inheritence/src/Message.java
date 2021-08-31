public class Message {
    private String text;
    private String recepient;
    private int id;

    public Message(String text, String recepient, int id) {
        this.text = text;
        this.recepient = recepient;
        this.id = id;
    }
    public void getDetails(){
        System.out.println("Contact name: "+recepient+" "+"\nMessage :"+text+" "+"\nId: "+id);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRecepient() {
        return recepient;
    }

    public void setRecepient(String recepient) {
        this.recepient = recepient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
