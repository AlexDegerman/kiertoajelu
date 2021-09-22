public class Sailio {
    private int sisalto;
    
    public Sailio() {
        this.sisalto = 0;
    }
    public int sisalto() {
        return sisalto;
    }
    public void lisaa(int maara){
        if (maara > 0){
            sisalto += maara;
            if (sisalto > 100){
                sisalto = 100;
            }
        }
    }
    public void poista(int maara) {
        if (maara > 0){
            sisalto -= maara;
            if (sisalto < 0) {
                sisalto = 0;
            }
        }
    }
    @Override
    public String toString() {
        return sisalto + "/100";
    }
}
