package scjp.chapter.three.slorber;

public class Arrays2 {
    public static void changeIt(int[][]arrays ) {   // 1
        arrays[0] = new int[] {35,36,37,38,39};       // 2
    }
    public static void main(String... args) {
        int [] tab1D = new int [5];                     // 3
        int [][] tab2D = new int[][] { tab1D };         // 4                    
        changeIt(  new int[][] { tab1D }  );            // 5   
        System.out.println(tab1D[0]);                   // 6
        System.out.println(tab2D[0][0]);                // 7
        changeIt(tab2D);                                // 8
        System.out.println(tab1D[0]);                   // 9
        System.out.println(tab2D[0][0]);                // 10
    }
}
// Pb de compilation sur la ligne ... ?
// Runtime exception sur la ligne ... ?
// La console affiche ... ?