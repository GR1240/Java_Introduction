// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, 
// которая состоит из чередующихся символов c1 и c2,
// начиная с c1. 

public class AlternatingChars {
    public static void main(String[] args) {
        int n = 200_000;
        char c1 = 'a';
        char c2 = 'b';

        long start = System.currentTimeMillis();
        alternatingCharsString(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        alternatingCharsSb(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);
    }

    public static String alternatingCharsString(int n, char c1, char c2) {
        String str = " ";
        for (int i = 0; i < n / 2; i++) {
                str = str + c1 + c2;
        }
        return str;
    }

    public static String alternatingCharsSb(int n, char c1, char c2) {

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);
        }
        return sb.toString();
    }
}