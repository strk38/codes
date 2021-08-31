import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Problem01 {
    
   static int mat [][];
   static int price [];
   static int form [];
   static String playerName [];
   static String finalBuy [];
   static int n;
   static int W;
    public static void main(String[] args) {
        Scanner keyboard =new Scanner (System.in);
        
         System.out.println("Enter num. of player");
         n=keyboard.nextInt();
         
         System.out.println("Enter budget");
         W=keyboard.nextInt();
         keyboard.nextLine();
        mat=new int[n+1][W+1];
        playerName=new String [n+1];
        
        price= new int[n+1];
        
        form=new int[n+1];
        
        finalBuy=new String[n+1];
        
      
        
        for (int i = 0; i <n+1; i++) {
            System.out.println("Give player name");
            playerName[i]=keyboard.nextLine();
            System.out.println("Give player price");
            int p=keyboard.nextInt();
            price[i]=p;
            System.out.println("give form");
            form[i]=keyboard.nextInt();
            keyboard.nextLine();
            
            
        }
        

          
          


           knapsack();
           
                      


       
        int result=mat[n][W];
        
        printItem(result);
        
        System.out.println("Bought Players:");
        
        int count=0;
        for (int i = 0; i <finalBuy.length; i++) {
            if(finalBuy[i]!=null)count++;
        }
        
        int c=1;
         for (int i = 0; i < finalBuy.length; i++) {
            if(finalBuy[i]!=null){
                System.out.print(finalBuy[i]);
                if(c<count)System.out.print("->");{
                c++;
            }
            }
        }
        System.out.println(" ");
        System.out.println("Maximum summation of form: "+ mat[n][W]);
    }
    
    static void knapsack(){
    
                 
        for (int i = 0; i < n+1; i++) {
            for (int currentValue = 0; currentValue < W+1; currentValue++) {
              if(currentValue==0||i==0)mat[i][currentValue]=0;
              else if(currentValue < price[i]){
                  mat[i][currentValue]=mat[i-1][currentValue];
              }
              
             
              else{
                  mat[i][currentValue]=max(i,currentValue);
              }
            }
           
        }
        
    }
    static int max(int i, int cv){
        if((form[i]+mat[i-1][cv-price[i]])>(mat[i-1][cv])) return form[i]+mat[i-1][cv-price[i]];
        else if((form[i]+mat[i-1][cv-price[i]])==(mat[i-1][cv]))return form[i]+mat[i-1][cv-price[i]];
        else return mat[i-1][cv];
    }
    
    static void printItem(int res){
    
        int w=W;
        
        for (int i = n+1; i > 0; i--) {
            if(res>0){
                if(res == mat[i-1][w]) continue;
                else{
                        
                       finalBuy[i]=playerName[i];
                       res=res-form[i];
                       w=w-price[i];
                }
            
            }
        }
    
    }
}
