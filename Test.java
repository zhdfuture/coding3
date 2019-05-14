import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void yuesefu(int totalNum,int countNum){
 //初始化人数
        List<Integer>start=new ArrayList<Integer>();
        for(int i=1;i<=totalNum;i++){
            start.add(i);   //将a添加到list中
        }
        //从第K个开始计数
    int k=0;
    while(start.size()>0){
        k+=countNum;
        //第m人的索引位置
        k=k%(start.size())-1;
        //判断是否到队尾
        if(k<0) {
            System.out.print(start.get(start.size() - 1));
            start.remove(start.size() - 1);
            k = 0;

            System.out.println();
        }
        else{
            System.out.print(start.get(k));
            start.remove(k);
        }
        }

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入总人数：");
        int totalNum=scan.nextInt();
        System.out.println("请输入报数的大小：");
        int cycleNum=scan.nextInt();
        yuesefu(totalNum,cycleNum);

}
}