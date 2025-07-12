package Com.Pattern;

public class Dimond {
    public static void main(String[] args) {
        Pattern28(4);

    }

    static void Pattern28(int n) {
        for(int row = 1 ; row <= 2*n-1 ; row++ ){
            int c = row>n ? 2*n - row : row;

            for(int space=1;space<=n-c;space++){
                System.out.print(" ");
            }
            for(int col =c; col >=1 ; col--){
                System.out.print("*");
            }
            for(int col = 2 ; col<=c ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
