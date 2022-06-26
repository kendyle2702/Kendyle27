import java.util.concurrent.ForkJoinPool;

class Richestcustomer1 {
    public int maximumWealth(int[][] accounts) {
        int Max = 0;
        int Row_number = accounts.length;
        int Column_number = accounts[0].length;
        int Money_eachperson;

        // duyệt mảng và tính tổng tiền từng người
        for (int i = 0; i < Row_number; i++) {
            Money_eachperson = 0;
            for (int j = 0; j < Column_number; j++) {
                Money_eachperson = Money_eachperson + accounts[i][j];
            }
            // check số tiền lớn nhất
            if (Money_eachperson >= Max) {
                Max = Money_eachperson;
            }
        }
        return Max;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = arr1;
        arr1[3] = 0;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ---");
            System.out.print(arr2[i] + ".");
           
        }
    }
}