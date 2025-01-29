//Problem No:1652 Defuse the Bomb
import java.util.*;
public class DefuseBomb {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    }
    public int[] decrypt(int [] code,int k){
        int n=code.length;
        int[] result=new int[n];
        if(k==0){
            return result;
        }
        int start,end,step;
        if(k>0){
            start=1;
            end=k;
            step=1;
        }else{
            start=-1;
            end=k;
            step=-1;
            k=-k;
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=1;j<=k;j++){
                int index=(i+(j*step)+n)%n; //handling circular indexing
                sum+=code[i];
            }
            result[i]=sum;
        }
        return result;
    }
}
