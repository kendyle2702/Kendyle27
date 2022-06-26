

class Stringgg {
    public static int myAtoi(String s) {
        int Am_Duong = 0;
        int j = 0;
        long ketqua;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Điều kiện 1
            if (c == ' ') {

            }
            // Điều kiện 2
            else if (c == '+' || c == '-') {
                if (c == '+') {
                    Am_Duong = 1;
                } else {
                    Am_Duong = 2;
                }

            }
            // Điều kiện 3
            else if (c >= '0' && c <= '9') {
                result = result + c;
                j++;
            }
            // Điều kiện 4
            else if (c >= 'a' && c <= 'z') {
                break;
            }
        }
        if (j == 0) {
            return 0;
        } else {
            ketqua = Integer.parseInt(result);
            if (ketqua >= 0)
                if (Am_Duong == 2) {
                    return -ketqua;
                } else {
                    return ketqua;
                }
        }
    }

    public static void main(String[] args) {
        String s = "j020dggag";
        System.out.println(myAtoi(s));
    }
}