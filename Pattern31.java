package Com.Pattern;

public class Pattern31 {
    public static void main(String[] args) {
    pattern31(4);
    }
    static void pattern31(int n){
        int originalN = n ;
        n = 2* n ;
        for(int row = 0 ; row <= n ; row++){
            for(int col = 0 ; col <= n ; col++){
               // int atEveryIndex = Math.min(Math.min(row,col),Math.min(n-row,n-col));
                int atEveryIndex =  originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));

//                int min = Math.min(Math.min(row, col), Math.min(n - row, n - col));
//                int atEveryIndex = Math.max(1, originalN - min);

                System.out.print(atEveryIndex);
            }
            System.out.println();
        }
    }
}
