public class Test2 { 
   public static void main(String[] args) { 
       Integer I = 10; // Autoboxing: primitive int to Integer 
       Integer J = 20; // Autoboxing 
       
       // Autounboxing: Automatically converts Integer to int 
       System.out.println(I.intValue()); // Output: 10 
       System.out.println(I); // Output: 10 
       
       System.out.println(J.intValue()); // Output: 20 
       System.out.println(J); // Output: 20 
       
       // Autounboxing and arithmetic 
       Integer K1 = I + J; // Autounboxing for addition, then autoboxing for result 
       Integer K2 = I + J + K1; 
       System.out.println(K2); // Output: 60 
   } 
} 