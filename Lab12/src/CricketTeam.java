public class CricketTeam extends Team {

    public CricketTeam(String n,String masc) {
        super(n, masc);
    }
        public String toString(){
            return "Our name is "+name;
        }
        @Override
        public void getMascot() {
            System.out.println("We play Cricket. ");
            System.out.println("Our Cricket team mascot name is "+mascot);
        }
}


