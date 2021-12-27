

public class FindDuplicate {
    public static void main(String[] args) {
        int [] array = new int [args.length];
        for(int x = 0; x<args.length; x++) {
            array[x] = Integer.parseInt(args[x]);
        }
        boolean numberduplicate = false;
        for(int x = 0; x<array.length; x++){
            for(int y = x+1; y<array.length; y++){
                if(array[x] == array[y]){
                    numberduplicate = true;
                }
            }
        }
        System.out.println(numberduplicate);;
















    }

}