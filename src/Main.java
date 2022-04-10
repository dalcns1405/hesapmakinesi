import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("toplam: " + result);
        return result;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Bölme İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Çıkarma işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        System.out.println(menu);

        while (true) {

            System.out.println("Bir işlem seçiniz: ");
            select = scan.nextInt();

            if(select==0){
                break;
            }

            System.out.print("İlk Sayı: ");
            int a =scan.nextInt();
            System.out.print("İkinci sayı " );
            int b =scan.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;

            }


        }


    }
}
