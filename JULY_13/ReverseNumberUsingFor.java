// 9. reverse order using for loop

public class ReverseNumberUsingFor {
    public static void main(String[] args) {
        long number = 7676356614L;
        long reversedNumber = 0;
        
        System.out.println("Original number: " + number);
        System.out.print("Reversed number: ");
        
        for (; number != 0; number /= 10) {
            long reminder = number % 10; 
            reversedNumber = reversedNumber * 10 + reminder; 
        }
        
        System.out.println(reversedNumber);
    }
}
