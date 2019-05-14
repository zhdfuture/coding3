//快乐数
public class Test1 {
    //判断各个位上的平方和
    public static int function(int num) {
        int ret = 0;
        while (num != 0) {
            ret = ret + (num % 10) * (num % 10);
            num = num / 10;  //123/10=12

        }
        return ret;
    }

    public static boolean isHappy(int n) {
        int ret = 0;
        if (n <= 0) {
            return false;
        }
        while (n != 1) {
            n = function(n);
            if (n == 4) {
                return false;
            }

        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isHappy(5));
        System.out.println(isHappy(7));
    }
}
