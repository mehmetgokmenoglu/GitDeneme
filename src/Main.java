import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan giriş almak için Scanner nesnesi oluştur
        Scanner scanner = new Scanner(System.in);

        // İlk sayıyı al
        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        // İkinci sayıyı al
        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        // Toplamı hesapla
        int toplam = sayi1 + sayi2;

        // Sonucu yazdır
        System.out.println("Toplam: " + toplam);
    }
}
