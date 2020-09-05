package SadiGitHub;

import java.util.Scanner;

public class BasitIslemler {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("İlk sayıyı girin");
        int sayi1 = sc1.nextInt();
        System.out.println("İkinci sayıyı girin");
        int sayi2 = sc1.nextInt();
        int toplam = sayi1 + sayi2;
        int fark = sayi1 - sayi2;
        int carpim = sayi1 * sayi2;
        int bolum = sayi1 / sayi2;
        int kalan = sayi1 % sayi2;
        String cümle="Sırasıyla toplam, fark, carpim, bolum, kalan\n"+
                toplam +" "+ fark+" " + carpim+" " + bolum+" " + kalan;
        String padded = String.format("%-20s", cümle);
        System.out.println(cümle);
    }
}
