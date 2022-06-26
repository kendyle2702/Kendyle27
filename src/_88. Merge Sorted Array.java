class merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int solan = 0;
        for (int i = 0; i < n; i++) {
            Chenphantuvaomang(nums1, m, nums2[i], solan);
            solan++;
            m++;
        }
    }
    // Đẩy lùi các ptu về sau và chèn
    private static void Chenphantuvaomang(int[] nums1, int m, int k, int solan) {
        boolean timduoc = false;
        for (int j = 0 + solan; j < m; j++) {
            if (nums1[j] > k) {
                timduoc = true;
                for (int l = m; l > j; l--) {
                    nums1[l] = nums1[l - 1];
                }
                nums1[j] = k;
                break;
            }
        }
        if (timduoc == false) {
            nums1[m] = k;
        }
    }
    public static void merge2index(int[] nums1, int m, int[] nums2, int n) {
        //gọi 3 con trỏ. Với k chạy trên nums1
        int i = m - 1, j = n - 1, k = m + n - 1;
        // Duyệt mảng ngược lại
        while (k >= 0) {
            if (i < 0) {
                nums1[k] = nums2[j];
                j--;
            } else if (j < 0) {
                nums1[k] = nums1[i];
                i--;
            } else if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else if (nums1[i] <= nums2[j]) {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
    public static void main(String[] args) {
        int[] a1 = { 2, 3, 5, 0, 0, 0 };
        int[] a2 = { 0, 2, 5 };
        merge(a1, 3, a2, 3);
        System.out.println("done");
    }
}
