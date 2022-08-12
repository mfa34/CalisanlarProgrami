public class Yazilimci extends Calisanlar{
    private  String diller ;

    public Yazilimci (String isim , String soy_ad , int id,String diller ){
        super(isim,soy_ad,id);
        this.diller=diller;
    }
    public void format_at(String isletim_sistemi){
        System.out.println(getIsim()+""+isletim_sistemi+" ni yukluyor...");

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yazilimcinin bildigi diller "+ diller);

    }
}
