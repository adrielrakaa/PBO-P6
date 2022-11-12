package Sesi6;

public abstract class BangunDatar {
    String warna;
    
    String getName(){
        return warna;
    }

    void setWarna(String warna){
        this.warna=warna;
    }
    abstract float getLuas();
}
