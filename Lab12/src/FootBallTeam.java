public class FootBallTeam extends Team {

    public FootBallTeam(String n,String masc){
       super(n,masc);
    }
public String toString(){
        return "Our name is "+name;
}
    @Override
    public void getMascot() {
        System.out.println("We play Football. ");
        System.out.println("Our football team mascot name is "+mascot);
    }
}
