public class getMedianSolution {
    public static int getUpMedian(int[] array1, int[] array2){
        if(array1==null||array2==null||array1.length!=array2.length){
            throw new RuntimeException("输入的数组是无效的");
        }
        int left1=0;
        int right1=array1.length-1;
        int left2=0;
        int right2=array2.length-1;
        int mid1=0,mid2=0;
        int offset=0;
        if(left1==right1){//每个数组中只有一个元素
            return Math.min(array1[left1],array2[left2]);
        }
        while(left1<right1){
           mid1=(left1+right1)/2;
           mid2=(left2+right2)/2;
           offset=((right1-left1+1)&1)^1;    //元素个数为偶数，则offset为1
            if(array1[mid1]>array2[mid2]){
                right1=mid1;
                left2=mid2+offset;
            }
            else if(array1[mid1]<array2[mid2]){
                left1=mid1+offset;
                right2=mid2;
            }
            else{
                return array1[mid1];
            }

        }
        return Math.min(array1[left1],array2[left2]);
    }

    public static void main(String[] args) {
        int[] array1={1,2,3,4};
        int[] array2={3,4,5,6};
        System.out.println(getUpMedian(array1,array2));
    }
}
