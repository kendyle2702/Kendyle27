class Hello {

    public static int findNumbers(int[] nums) {
        int biendem = 0;
        // duyệt từng phần từ rồi xét phần tử có số chữ số chẵn không?
        for (int a : nums) {
            int soLuongChuSo = tinhSoChuSo(a);
            if (soLuongChuSo % 2 == 0) {
                biendem++;
            }
        }
        return biendem;
    }

    // hàm kiểm tra có ptu có mấy chữ số
    public static int tinhSoChuSo(int a) {
        int biendem = 0;
        int kq = a;
        while (kq != 0) {
            kq = a / 10;
            a = kq;
            biendem++;
        }
        return biendem;
    }

    public static void main(String[] args) {
        String a = "09782";
        char b = ' ';
        a = a + b;
        int c = Integer.parseInt(a);
        System.out.println(c);
    }
}