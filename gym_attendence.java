// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            int tem = sc.nextInt();
            arr[i]=tem;
        }
        int sum=0;
        int maxi = -1;
        int day=0;
        for(int j=0;j<n;j++){
            sum+=arr[j];
            if (arr[j]>maxi){
                maxi=arr[j];
                day=j;
                
            }
        }
        sum=sum/n;
        System.out.println("avarage attendence is:"+sum);
        int mini = maxi;
        for(int j=0;j<n;j++){
            if (arr[j]>sum || arr[j]==sum){
                System.out.println(arr[j]);
            }
            if (arr[j]<mini){
                mini=arr[j];
            }
        }
        System.out.println(mini);
        System.out.println("maximium attendence is on:"+day);
    }
}
