public class ComplexNumber extends RealNumber{
    private double ImaginaryValue=-1.0;
    public ComplexNumber(){
        setRealValue(1.0);
    }

    public ComplexNumber(int a,int b){
        setRealValue(a);
        ImaginaryValue=b;
    }
    public void setImaginaryValue(double d){
        ImaginaryValue=d;
    }

    public double getImaginaryValue() {
        return ImaginaryValue;
    }

    public void check(){
        System.out.println("I'm in complex number.");
        super.ping();
        System.out.println("Checking ended. ");
    }

    public String toString(){
        return "RealPart :"+getRealValue()+
                " ImaginaryPart :"+getImaginaryValue();
    }
}
