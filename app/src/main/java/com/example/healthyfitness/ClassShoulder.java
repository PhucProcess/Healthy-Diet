package com.example.healthyfitness;
import java.util.ArrayList;
public class ClassShoulder {
    private String tips;
    private int pic;
    private String direct;
    private String attention;
    private int directpic;

    public ClassShoulder(String tips,int pic,String direct,String attention,int directpic) {
        this.tips = tips;
        this.pic = pic;
        this.direct = direct;
        this.attention=attention;
        this.directpic=directpic;
    }
    public String getName() { return tips; }
    public void setName(String tips) {
        this.tips = tips;
    }
    public int getPic() {
        return pic;
    }
    public void setPic(int pic) { this.pic = pic; }
    public String getDirect(){return direct;}
    public void setDirect(String direct){this.direct=direct;}
    public String getAttention() { return attention; }
    public void setAttention(String attention) {
        this.attention = attention;
    }
    public int getImageDirect() {
        return directpic;
    }
    public void setImageDirect(int directpic) { this.directpic = directpic; }

    public static ArrayList<ClassShoulder> init() {
        String[] tips = {"Seated Elbows in dumbbells", "Pull the cable across the face", "Shoulders on a reclining chair", "Single hand lifting weights", "Shrug with dumbbells"};
        String[] direct ={
                "Direct:\n" +
                "1. Exhale as you press the dumbbells upward, over your head, until your arms are almost fully extended.\n" +
                "2. Inhale as you lower the dumbbells to the starting position.\n" +
                "3. Repeat.",
                "Direct:\n" +
                        "1. Keeping your elbows very slightly flexed, exhale as you raise the stirrups forward and upward in a semicircular motion until your arms are a little above horizontal.\n" +
                        "2. Hold for a count of two.\n" +
                        "3. Inhale as you lower the stirrups to the starting position in a controlled manner.\n" +
                        "4. Repeat.",
                "Direct:\n" +
                        "1. Sit down on the seat and grip the bar overhead at a comfortable position with hands slightly wider than a shoulder-width distance apart. Keep your torso upright and core tight.\n" +
                        "2. Then, unrack the barbell and slowly lower it down to chin level with elbows just slightly tucked in. Inhale during this portion of the exercise.\n" +
                        "3. Now, press the barbell back up but don’t lock out your elbows. Exhale during this portion of the exercise.\n" +
                        "4. Repeat for the desired number of reps.",
                "Direct:\n" +
                        "1. Keeping your elbows very slightly flexed, exhale as you raise the dumbbells forward and upward in a semicircular motion until your arms rise a little above horizontal.\n" +
                        "2. Hold for a count of two.\n" +
                        "3. Inhale as you lower the dumbbells in a controlled manner to the starting position.\n" +
                        "4. Repeat for the prescribed number of repetitions.",
                "Direct:\n" +
                        "1. Keeping your elbow slightly bent, exhale as you raise your right arm in front of you until it is at least parallel to the floor.\n" +
                        "2. Hold for a count of two.\n" +
                        "3. Inhale as you lower your right arm to the starting position.\n" +
                        "4. Repeat with your left arm.\n" +
                        "5. Keep alternating your arms, raising one after the other one has been fully lowered."};
        String[] attention ={
                "Attention:\n" +
                "- Keep your back and neck neutral.\n" +
                "- Do not lock out your elbows.\n" +
                "- By keeping your elbows tucked into your body, you put less pressure on the shoulder joints, making this variation of the overhead press more suitable for those who suffer from shoulder pain. You also emphasize the use of your anterior deltoid and upper pectoralis major, and reduce the contribution of your lateral deltoid.\n" +
                "- The seated position prevents cheating by ensuring that your body is kept still.",
                "Attention:\n" +
                        "- Keep your back neutral and your body still. Only your arms should move.\n" +
                "- When lifting heavy, stagger your feet and lean forward a little to improve balance.\n" +
                "- If you feel pain in your shoulder when you perform the double cable front raise, try decreasing the height to which you raise the stirrups.\n" +
                "- The point of keeping your elbows very slightly flexed is to preserve the health of your elbow joints.\n" +
                "- Instead of raising both arms simultaneously, you can alternate your arms. Use both variations of the exercise to derive the benefits of both.",
                "Attention:\n" +
                        "- You can also do the overhead press using dumbbells.\n" +
                        "- The standing overhead press is a great alternative to the seated barbell overhead press.\n" +
                        "- If you don’t have a seated press stand, you can use a fixed barbell and perform the movement on a padded seat.\n" +
                        "- Keep the barbell movement in a straight line as close to your body as possible. This ensures you can perform the exercise for optimal effectiveness.\n" +
                        "- Keep your core tight during the movement for optimal stabilization.\n" +
                        "- The seated barbell overhead press targets the anterior shoulders mostly but it also works the lateral muscle secondarily.",
                "Attention:\n" +
                        "- Do not swing the dumbbells.\n" +
                        "- Keep your back neutral and against the back support (if sitting on a chair).\n" +
                        "- Only your arms should move. Keep your body still.\n" +
                        "- If you must sway your body back and forth to raise the dumbbells, the dumbbells are too heavy. Reduce the weight.\n" +
                        "- There are different ways in which you can hold the dumbbells during the seated dumbbell front raise. You can maintain a neutral (hammer) grip or a pronated (overhand) grip throughout the movement. As in the illustration, you can also start off the raise using a neutral grip and, as your arms pass your legs, you can rotate (pronate) your wrists so that your palms face downward at the top of the movement. I recommend that you maintain a neutral grip, as this reduces the chances of shoulder impingement.",
                "Attention:\n" +
                        "- Keep your back straight and body still. Do not sway back and forth.\n" +
                        "- You may use either a pronated (overhand) grip, as described, or a neutral (hammer) grip. You may also complete all of the reps for the first arm before moving on to the reps for the opposite arm.\n" +
                        "- Do not swing the dumbbells. Keep the movement under control.\n" +
                        "- Try to resist the lowering of the dumbbells.\n" +
                        "- The alternating dumbbell front raise is a unilateral exercise. Unilateral training (training one side at a time) has certain benefits over bilateral training (training both sides at the same time). First, you can actually lift more weight when training unilaterally because the resources of your nervous system are not divided between the two sides and you can therefore recruit more muscle fibers from the one side. Second, you get a better core workout because more stabilizer muscles in your core have to be recruited to stabilize your body. However, this does not mean that you should only perform the unilateral versions of exercises. For best results, incorporate both unilateral and bilateral training into your program."};

        int[] pics = {
                R.drawable.seated,
                R.drawable.double0,
                R.drawable.seatedbarbelloverhead0,
                R.drawable.frontraise0,
                R.drawable.alter0,};
        int[] directpic = {
                R.drawable.seated1,
                R.drawable.double1,
                R.drawable.seatedbarbelloverhead1,
                R.drawable.frontraise1,
                R.drawable.alter1,};
        ArrayList<ClassShoulder> arrayList = new ArrayList();
        for (int i = 0; i < tips.length; i++) {
            ClassShoulder shoulder = new ClassShoulder(tips[i],pics[i],direct[i],attention[i],directpic[i]);
            arrayList.add(shoulder);
        }
        return arrayList;
    }

}
