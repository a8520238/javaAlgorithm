/**输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。 */
package offer;
public class NumberOf1_11 {
    public int NumberOf1(int n) {
        
        //最右侧消1法
        int num = 0;
        while (n != 0) {
            //n = (n-1) & n;
            num++;
            n &= (n-1);
            
        }
        return num;
        // 无符号右移法
        /**
        正数右移：保持为正数，相当于/2。  
        负数右移：保持为负数，移位前是负数，移位后保持是负数，因此移位后最高位设为1。
                如果一直右移，最终会变成-1，即(-1)>>1是-1。  
        正数左移：不保持为正数，相当于*2。（注意：1左移31时为负数最大值）  
        负数左移：不保持为负数，在左移的过程中会有正有负的情况。
                所以切记负数左移不会特殊处理符号位。如果一直左移，最终会变成0.
        */
        
        /*
        int num = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                num++;
            }
            n >>>= 1;
        }
        return num;
        */
        //标志左移法
        /*
        int num = 0, flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                num++;
            }
            flag <<= 1;
        }
        return num;*/
    }
}