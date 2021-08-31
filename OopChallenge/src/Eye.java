public class Eye extends Organ {
    private String color;
    private Boolean isOpen;

    public Eye(String name, String medicalCondition, String color, Boolean isOpen) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpen = isOpen;
    }

    @Override
    public void details() {
        super.details();
        System.out.println("Color: "+this.getColor());
    }

    public void open(){
        this.setOpen(true);
        System.out.println(this.getName()+" opened");
    }
    public void close(){
        this.setOpen(false);
        System.out.println(this.getName()+" closed");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }

}
