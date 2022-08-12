public class Yonetici  extends  Calisanlar{
    private int  sorumlu_kisi_sayisi ;

    public Yonetici(String isim, String soy_ad, int id, int sorumlu_kisi_sayisi) {
        super(isim, soy_ad, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yoneticinin sorumlu oldugu kisi sayisi :" + sorumlu_kisi_sayisi);

    }
    public void zam_yap (int zam_miktari){
        System.out.println("Yonetici "+getIsim()+"  calisanlara  "+zam_miktari + "  TL zam yapildi");

    }
}
