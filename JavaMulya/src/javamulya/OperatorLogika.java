package javamulya;
        
public class OperatorLogika {
    
 public static void main (String[] args) {
   int i1 = 100; int j1 = 200;
   if ((i1 == 99) & (--j1 == 199)) {
     System.out.println("Value1: " + (i1 + j1) + " ");
   } else {
     System.out.println("Value2: " + (i1 + j1) + " ");
   }
   int i2 = 100; int j2 = 200;
   if ((i2 == 99) && (--j2 == 199)) {
     System.out.println("Value1: " + (i2 + j2) + " ");
   } else {
     System.out.println("Value2: " + (i2 + j2) + " ");
   }
   int i3 = 100; int j3 = 200;
   if ((i3 == 100) | (--j3 == 200)) {
     System.out.println("Value1: " + (i3 + j3) + " ");
   } else {
     System.out.println("Value2: " + (i3 + j3) + " ");
   }
   int i4 = 100; int j4 = 200;
   if ((i4 == 100) || (--j4 == 200)) {
     System.out.println("Value1: " + (i4 + j4) + " ");
   } else {
     System.out.println("Value2: " + (i4 + j4) + " ");
   }
 }
}