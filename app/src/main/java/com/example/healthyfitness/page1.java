package com.example.healthyfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class page1 extends AppCompatActivity {

    //private static int SPLASH_SCREEN = 5000;
    //variables
    Animation topAnim, bottomAnim;
    ImageView image;
    TextView slogan,tip1,tip2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_page1);

        //animations
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //hooks
        image =findViewById(R.id.imageView);
        slogan =findViewById(R.id.textView);
        tip1 =findViewById(R.id.textView2);
        tip2 =findViewById(R.id.textView3);

        image.setAnimation(topAnim);
        slogan.setAnimation(bottomAnim);
        tip1.setAnimation(bottomAnim);
        tip2.setAnimation(bottomAnim);

        /*new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent intent= new Intent(page1.this,page2.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);*/
        btn = findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page1.this, page2.class);
                startActivityForResult(intent, 100);
            }
        });
    }
}