/*
 *  Author@ Harshil Patel
 *java RURottenTomatoes 3 2 4 2 3 3 4 1
 *0
*/
public class RURottenTomatoes {

    public static void main(String[] args) {
        //placeholder for the ratings after second parse input
        int ratinginput = 2;
        int rows = Integer.parseInt(args[0]);
        int columns = Integer.parseInt(args[1]);
        int [][] movieRatings= new int [rows][columns];
        int [] totalRate= new int [columns];
       
        for(int h=0;h<rows;h++){
            for(int p=0;p<columns;p++){
                int t = Integer.parseInt(args[ratinginput]);
                movieRatings[h][p]=t;
                totalRate[p]+=t;
                ratinginput++;
                
            }
        }
        int maxRate = 0;
        int maxCurrent = 0;
        for(int i=0; i<totalRate.length; i++){

            if (totalRate[i] > maxRate){
                maxRate=totalRate[i];
                maxCurrent= i;
            }

        }
        
        System.out.println(maxCurrent);
    }
}