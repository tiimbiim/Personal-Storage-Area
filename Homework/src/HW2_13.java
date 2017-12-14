import java.util.Random;
public class HW2_13 {
        public static void main(String []args)
        {
            
            Random rim = new Random();
            
            int a,b,c;
            
            a = rim.nextInt(699)+100;
            b = rim.nextInt(642)+100;
            c = rim.nextInt(8999)+1000;
            System.out.println("Random phone number is " + a + "-" + b + "-" + c);
            
        }       
}
