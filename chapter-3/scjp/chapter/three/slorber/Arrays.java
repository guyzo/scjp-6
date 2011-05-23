package scjp.chapter.three.slorber;

public class Arrays {
    public static void do(int[]... arrays ) {   // 1
        System.out.println(arrays[0][1]);       // 2
        System.out.println(arrays[5][3]);       // 3
    }
    public static void main(String... args) {
        int [] Object = null;                           // 4
        do(                                             // 5
                new int[][] {                           // 6
                        new int[] {new Integer(6),3,} , // 7
                        new int[] {6,8,10},             // 8 
                        Object                          // 9
                }
        );
    }
}

// Pb de compilation sur la ligne ... ?
// Runtime exception sur la ligne ... ?
// La console affiche ... ?