/*************************************************************************
 *  
 *  @author: Harshil
 *
 * 
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {

        int n =Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        double h = 0;
        for (int i = 0; i< n; i++){
            System.out.println("("+x+","+y+")");
                int prob = (int)(Math.random() * 4) + 1;
                if (prob == 1) {
                x+=1;
                }
                if  (prob == 2) {
                x-=1;
                }
                if (prob == 3) {
                y+=1;
                }
                if (prob == 4){
                y-=1;  
                }  
                    
                
            
        }
        System.out.println("("+x+","+y+")");
         h = Math.pow(x,2) + Math.pow(y,2);

        System.out.println("Squared Distance ="+h);
        
                

    }
}

