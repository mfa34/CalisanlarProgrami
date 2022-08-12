import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calisanlar Pogramina hos geldiniz .");
        String islemler = "Islemler ...\n" +
                "1.Yazilimci Islemleri\n"+
                "2.Yonetici Islemleri\n"+
                "Cikis icin q ' ya basiniz .";
        System.out.println("********************");
        System.out.println(islemler);
        while (true){
            System.out.print("Lutfen Yapmak Istediginiz Islemi Seciniz ↓");
            String islem = input.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan Cikiliyor...");
                break;
            }
            else if (islem.equals("1")){
                Yazilimci yazilimci1 = new Yazilimci("mehmet fatih","aydin",1446,"java , python,css");
                String yazilimci_islem = "1.Format At\n"+
                        "2.Bilgileri Goster\n"+
                        "Cikis icin Lutfen q ' ya basiniz..\n";
                System.out.println(yazilimci_islem);
                while (true){
                    System.out.print("Lutfen Yapmak istedigininz islemi seciniz ..");
                    String y_islem = input.nextLine();

                    if (y_islem.equals("q")){
                        System.out.println("Programdan cikiliyor..");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.println("isletim sistemi : ");
                        String isletim_sistemi = input.nextLine();
                        yazilimci1.format_at(isletim_sistemi);
                    } else if (y_islem.equals("2")) {
                        yazilimci1.bilgileriGoster();
                        
                    }else {
                        System.out.println("Gecersiz Yazilimci Islemi Gerceklestirdiniz,");
                    }


                }
            }else if (islem.equals("2")){
                Yonetici yonetici1 = new Yonetici("numan","aydin",110,52);
                String yonetici_islemleri = "Yonetici Islemleri\n"+
                        "1.Zam Yap\n"+
                        "2.Bilgileri Goster\n"+
                        "Cikis yapmak icin q ' ya basiniz\n";
                System.out.println(yonetici_islemleri);
                while (true){
                    System.out.println("Yapmak istediginiz islemi seciniz ");
                    String y_islem = input.nextLine();

                    if (y_islem.equals("q")){
                        System.out.println("Yonetici islemlerinden  cikis yapiliyor.");
                    } else if (y_islem.equals("1")) {
                        System.out.println("Yoneticinin ne kadar zam yapmasini istiyorsun ?");
                        int zam_miktari = input.nextInt();
                        input.nextLine();
                        yonetici1.zam_yap(zam_miktari);

                    }
                    else if (y_islem.equals("2")){
                        yonetici1.bilgileriGoster();
                    }
                    else {
                        System.out.println("Gecersiz yonetimi islemi gerceklestirdiniz.");
                    }
                }



            }else {
                System.out.println("Gecersiz islem gerceklestirdini.");
            }

        }



    }
}
