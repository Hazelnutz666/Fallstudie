public class A {
    private int a;
    static double b;
    private int staticC;
    public double d;
    private static float c;
    
    public void g() {
        d *= h(a);
    }
    
    private static double h(double z){
        return z * 3 + a ;
    }
    
    void i(double x) {
        b += x * c;
        x *= 2;
    }
    
    public static void k(A obj) {
        obj.d = 7.0;
    }
    
    public static void main(String[] args) {
        int f = (int) c;
        i(f);
    }
    
    
package Testshit;

/*
  class chessboard {

    public static void main(String[] args) {
      
         
        final int max = 8;
        int[][] dreieck = new int [8][];
        for (int i = 0; i < dreieck.length; i++) {
            dreieck[i] =new int [i + 1];
            for (int j=0; j< i + 1; j++) {
                dreieck[i][j]= i + j;
            }
        }
    System.out.print();

/*
*/

     
    }
    
     