/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author VörösDominik(SZF_202
 */
public class Konyv extends AbstractTermek implements Kolcsonozheto{
    private boolean KolcsonzesreAlkalmas;
    public Konyv(String cim) {
        super(cim);
    }

    @Override
    public boolean kolcsonozheto() {
        
        if (KolcsonzesreAlkalmas) {
            this.KolcsonzesreAlkalmas=true;
        }
        else{
            this.KolcsonzesreAlkalmas=false;
        }
        return KolcsonzesreAlkalmas;
    }

    @Override
    public String toString() {
        return "Konyv{" + "KolcsonzesreAlkalmas=" + KolcsonzesreAlkalmas + '}'+super.toString();
    }
    
}
