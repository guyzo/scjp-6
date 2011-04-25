package scjp.chapter.two.idrisbigui;

class Base { }

public class MyCast extends Base {
         static boolean b1=false;
         static int i = -1;
         static double d = 10.1;
         public static void main(String[ ] args]) {
                   MyCast m = new MyCast( );
                   Base b = new Base( );
                   // Here
         }
}


/*

choose the following that when inserted at the comment // Here will allow the code to compile and run without error.
1. b = m;
2. m = b;
3. d = i;
4. b1 = 1;


*/
