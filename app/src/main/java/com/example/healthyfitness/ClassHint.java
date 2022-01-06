package com.example.healthyfitness;
import java.util.ArrayList;
public class ClassHint {
    private String tips;
    private int pic;
    public ClassHint(String tips,int pic) {
        this.tips = tips;
        this.pic = pic;
    }
    public String getName() {
        return tips;
    }

    public void setName(String tips) {
        this.tips = tips;
    }
    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
    public static ArrayList<ClassHint> init() {
        String[] tips = {"womenshealthmag....", "openfit.com", "menshealth.com", "redbull.com", "lifehack.org", "healthdirect.gov.au", "prevention.com", "cooperaerobics.com"};
        int[] pics = {
                R.drawable.womenhealthmag,
                R.drawable.openfit,
                R.drawable.menshealth,
                R.drawable.redbull,
                R.drawable.lifehack,
                R.drawable.healthdirect,
                R.drawable.prevention,
                R.drawable.cooperaerobics1,};
        ArrayList<ClassHint> arrayList = new ArrayList();
        for (int i = 0; i < tips.length; i++) {
            ClassHint hint = new ClassHint(tips[i],pics[i]);
            arrayList.add(hint);
        }
        return arrayList;
    }

}
