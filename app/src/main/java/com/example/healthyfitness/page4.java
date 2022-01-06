package com.example.healthyfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class page4 extends AppCompatActivity {

    Animation topAnim, bottomAnim;
    ImageView image;
    TextView slogan,tip1,tip2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //hooks
        image =findViewById(R.id.imageView4);
        slogan =findViewById(R.id.textView9);
        tip1 =findViewById(R.id.textView10);
        tip2 =findViewById(R.id.textView11);

        image.setAnimation(topAnim);
        slogan.setAnimation(bottomAnim);
        tip1.setAnimation(bottomAnim);
        tip2.setAnimation(bottomAnim);

        btn = findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page4.this, LoginActivity.class);
                startActivityForResult(intent, 100);
            }
        });
    }
}