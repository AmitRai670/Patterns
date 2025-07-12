package Com.Pattern;

public class Pattertnss {
    public static void main(String[] args) {
        pattern1(4);
    }



    static void pattern7(int n){
    for(int row=1;row<=n;row++){
        for(int col=1;col<=n-row-1;col++){
            System.out.print("");
        }
        for(int col=1;col<=n-row+1;col++){
            System.out.print("*");
        }
        System.out.println();
    }
    }

    static void pattern6(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=row-1;col++) {
                System.out.print("*");
            }
            System.out.print("*");
            System.out.println();

        }
    }


    static void pattern5(int n){
        for(int row=0;row<2*n;row++){
            int totalrowincol = row> n ? 2*n-row : row;
            for(int col=0;col<totalrowincol;col++){
                System.out.print("*");

            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col  +" ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for(int row =1;row<=n;row++){

            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row =1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("*");

            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
