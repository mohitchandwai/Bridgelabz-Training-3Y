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
        for(int j=0;j<n;j++){
            sum+=arr[j];
            if (arr[j]>maxi){
                maxi=arr[j];
                
                
            }
        }
        sum=sum/n;
        System.out.println("avarage marks is:"+sum);
        int mini = maxi;
        int count=0;
        for(int j=0;j<n;j++){
            if (arr[j]<40){
                System.out.println("you are just passed");
            }
            if (arr[j]>sum || arr[j]==sum){
                count++;
            }
            if (arr[j]<mini){
                mini=arr[j];
            }
        }
        System.out.println("no of students scored above avarage"+count);
        System.out.println("minimum marks is:"+mini);
        System.out.println("maximium marks is:"+maxi);
    }
}
