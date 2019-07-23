import java.util.Arrays;
import java.util.Scanner;

public class Gift {
    public int getValue(int[] gifts, int n) {
        int count = 1;
        if (gifts == null || n <= 0) {
            return 0;
        }
        int ret = gifts[0];
        for (int i = 1; i < n; i++) {
            if (gifts[i] == ret) {
                count++;
            } else
                count--;
            if (count == 0) {
                ret = gifts[i];
                count = 1;
            }
        }
        if (isLength(gifts,n,ret)) {
            return ret;
        } else
            return 0;
    }

    public boolean isLength(int[] gifts,int n,int ret){
        int count=0;
        for(int i=0;i<n;i++){
            if(gifts[i]==ret){
                count++;
            }
        }
        if(count>(n/2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Gift gift=new Gift();
        Scanner scan=new Scanner(System.in);
        String[] str=null;
       str=scan.next().split(",");
     int[] gifts=new int[str.length];
       for(int i=0;i<str.length;i++){
           gifts[i]=Integer.valueOf(str[i]);
       }
      int n =scan.nextInt();
        System.out.println(gift.getValue(gifts,n));
    }
}
