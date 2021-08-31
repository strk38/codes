import java.util.*;

public class main {
    public static void main(String[] args) {
        Patient patient= new Patient("Asta",18,
                new Eye("LeftEye","Short sighted","Blue",true),
                new Eye("RightEye","Normal","Red",true),
                new Heart("Heart","Normal",65),
                new Stomach("Stomach","PUD",false),
                new Skin("Skin","Burned","White",50));

        System.out.println("Name: "+patient.getName());
        System.out.println("Age: "+patient.getAge());

        Scanner keyboard= new Scanner(System.in);

        boolean shouldFinsh=false;

        while(!shouldFinsh){
            System.out.println("Choose an organ:"+
                    "\n\t1. Left Eye"+
                    "\n\t2. Right Eye"+
                    "\n\t3. Heart"+
                    "\n\t4. Stomach"+
                    "\n\t5. Skin"+
                    "\n\t6. Quit");
            int choice =keyboard.nextInt();
            switch(choice){
                case 1:
                    patient.getLefteye().details();
                    if(patient.getLefteye().getOpen()){
                        System.out.println("\t\t1.Close eye");
                        if(keyboard.nextInt()==1){
                            patient.getLefteye().close();
                        }
                        else{
                            continue;
                        }
                    }else{
                        System.out.println("1.Open the eye");
                        if(keyboard.nextInt()==1){
                            patient.getLefteye().open();
                        }else{continue;}
                    }
                    break;
                case 2:
                    patient.getRightEye().details();
                    if(patient.getRightEye().getOpen()){
                        System.out.println("\t\t1.Close eye");
                        if(keyboard.nextInt()==1){
                            patient.getRightEye().close();
                        }
                        else{
                            continue;
                        }
                    }else{
                        System.out.println("1.Open the eye");
                        if(keyboard.nextInt()==1){
                            patient.getRightEye().open();
                        }else{continue;}
                    }
                    break;
                case 3:
                    patient.getHeart().details();
                    System.out.println("\t\t1.Change heart rate");
                    if(keyboard.nextInt()==1){
                        System.out.println("Enter new heart rate");
                        int heartRate=keyboard.nextInt();
                        patient.getHeart().setRate(heartRate);
                        System.out.println("Hesrt rate changed to: "+patient.getHeart().getRate());
                    }
                    else{continue;}
                    break;
                case 4:
                    patient.getStomach().details();
                    System.out.println("\t\t1.Digest");
                    if(keyboard.nextInt()==1){
                        patient.getStomach().digest();
                    }
                    else{continue;}
                    break;
                case 5:
                    patient.getSkin().details();
                    break;
                default:
                    shouldFinsh=true;
                    break;
            }
        }
    }
}
