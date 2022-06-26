class remove {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int dem = 0;
        // so sánh loại bỏ rồi dời các ptu
        for (int i = 0; i < n - dem;) {
            if (nums[i] == val) {
                dem++;
                for (int j = i; j < n - dem; j++) {
                    nums[j] = nums[j + 1];
                }
            } else {
                i++;
            }
        }
        return n - dem;
    }

    public static int removeElement2index(int[] nums, int val) {
        // goi biến phụ và kỹ thuật 2 con trỏ
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4, 5 };
        int a = removeElement(arr, 2);
        System.out.println("done");
    }

}
