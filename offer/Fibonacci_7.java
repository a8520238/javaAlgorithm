/**大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。 
n<=39  */
package offer;
public class Fibonacci_7 {
    public int Fibonacci(int n) {
        if (n < 1) {
            return 0;
        }
        int a = 0, b = 1;
        while (n > 1) {
            int temp = a + b;
            a = b;
            b = temp;
            n--;
        }
        return b;
    }
}