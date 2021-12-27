/*
 *  Author@ Harshil Patel
 * java CheckDigit 048231312622
 * 0
 * java CheckDigit 9780470454310
 * 8
*/
public class CheckDigit {

    public static void main(String[] args) {
        long number = Long.parseLong(args[0]);
        long sum1 = 0;
        long digit1 = 0;
        long num1 = number;
        while (num1 > 0) {
            digit1 = num1 % 10;
            sum1 = sum1 + digit1;
            num1 = num1 / 100;
          }
        sum1 = sum1 % 10;
        long num2 = number;
        long sum2 = 0;
        long digit2 = 0;
        long finSUM = 0;
        num2 = number / 10;
        while (num2 > 0) {
            digit2 = num2 % 10;
            sum2 = sum2 + digit2;
            num2 = num2 / 100;
          }
          sum2 = sum2 % 10;
          sum2 = sum2 * 3; 
          sum2 = sum2 % 10;
          finSUM = sum1 +sum2;
          finSUM = finSUM % 10;
          System.out.println(finSUM);

    }
}