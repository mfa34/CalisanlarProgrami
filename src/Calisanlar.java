public class Calisanlar {
    private String isim;
    private String soy_ad;
    private int id ;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoy_ad() {
        return soy_ad;
    }

    public void setSoy_ad(String soy_ad) {
        this.soy_ad = soy_ad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Calisanlar(String isim, String soy_ad, int id) {
        this.isim = isim;
        this.soy_ad = soy_ad;
        this.id = id;
    }
    public void bilgileriGoster(){
        System.out.println("Ad : " + getIsim());
        System.out.println("Soyad : " + getSoy_ad());
        System.out.println("Id = "+ getId());

    }




}
