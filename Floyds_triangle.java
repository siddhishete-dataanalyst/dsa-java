
    private static void butterfly(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
public class Floyds_triangle {
    public static void floyds_triangle(int n) {
        int counter = 1;  // ✅ Declare the counter variable here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n){
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if( (i+j)%2 ==0){
                    System.out.print("1");
                } else {
                  System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    //            public static void butterfly(int n){
    //          //1st half 
    //            for(int i=1; i<=n; i++){
    //             //stars -i
    //             for(int j=1; j<=i;j++){
    //               System.out.print("*");
    //              }
        
            
    //              //spaces
    //                 for(int j=1; j<=2*(n-i); j++){
    //               System.out.print(" ");
    //              }
    //               //stars-i
    //                  for(int j=1; j<i; j++){
    //               System.out.print("*");
           
    //         }
    //       }
    //       //2nd half
    //       for(int i=n; i>=1; i--){
    //       //stars -i
    //             for(int j=1; j<=i;j++){
    //               System.out.print("*");
    //              }
        
            
    //              //spaces
    //                 for(int j=1; j<=2*(n-i); j++){
    //               System.out.print(" ");
    //              }
    //               //stars-i
    //                  for(int j=1; j<=i; j++){
    //               System.out.print("*");
           
    //         }
    //         System.out.println();
    //     }
    // }
//  public static void main(String[] args) {
//         butterfly(4);
//     }

      

   
    public static void butterfly(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 1; j <= 2 * (n - i); j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 1; j <= 2 * (n - i); j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }
    public static void solid_rhombus(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
  
    

    public static void main(String[] args) {
        // floyds_triangle(5);  // ✅ Corrected method call
        // zero_one_triangle(5);
        // int n =4;
        //butterfly(n);
  solid_rhombus(5);
    }
