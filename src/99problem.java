import java.util.Scanner;
class p99problem{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result;
        int[] arr = new int[5];
        int i =4;
        while(N!=0){
            arr[i] = N%10;
            N/=10;
            i--;        
        }


        if(i >=2) result = 99;
        else if(i == -1) result = 9999;
        else{
            if(10*arr[3] + arr[4]>=49){
                result = 1000*arr[1] + 100*arr[2] + 99;
            }
            else{
                arr[2] = arr[2] -1;
                if(arr[2]<0){
                    arr[1] = arr[1] -1;
                    arr[2] = 9;
                }
                result = 1000*arr[1] + 100*arr[2] + 99;
            }
        }
        System.out.println(result);
    }
}