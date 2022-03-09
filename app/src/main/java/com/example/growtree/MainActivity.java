package com.example.growtree;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity<level> extends AppCompatActivity {

    ImageView imageView,imageView2,imageView3;
    //boolean level;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn);
        count++;
       /* ImageView star = (ImageView) findViewById(R.id.star);
        AnimationDrawable frameAnimation = (AnimationDrawable) star.getDrawable();
        frameAnimation.start();

        ImageView star2 = (ImageView) findViewById(R.id.star2);
        AnimationDrawable frameAnimation = (AnimationDrawable) star2.getDrawable();
        frameAnimation.start();*/

        imageView = findViewById(R.id.star);
        imageView2 = findViewById(R.id.star2);
        imageView3 = findViewById(R.id.star3);
        //level = false;

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        //imageView.startAnimation(animation);
        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rot);
        //imageView2.startAnimation(animation2);
        Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.ro);

        View.OnClickListener listener = new View.OnClickListener() {
            ImageView star = (ImageView) findViewById(R.id.star);
            ImageView star2 = (ImageView) findViewById(R.id.star2);
            ImageView star3 = (ImageView) findViewById(R.id.star3);

            @Override
            public void onClick(View view) {
                if (count == 1) {
                    //  imageView.setImageResource(R.drawable.dream02);
                    // imageView.setImageResource(android.R.drawable.btn_star_big_on);
                    star.setVisibility(View.VISIBLE);
                    imageView.startAnimation(animation);
                    count++;
                    //level = true;
                } else if (count == 2) {
                    // imageView.setImageResource(R.drawable.dream01);
                    //imageView.setImageResource(android.R.drawable.star_big_on);
                    star2.setVisibility(View.VISIBLE);
                    imageView2.startAnimation(animation2);
                    count++;
                   // level = false;
                }
                else if (count == 3) {
                    // imageView.setImageResource(R.drawable.dream01);
                    //imageView.setImageResource(android.R.drawable.star_big_on);
                    star3.setVisibility(View.VISIBLE);
                    imageView3.startAnimation(animation3);
                    count++;
                    // level = false;
                }
            }


        };
        btn.setOnClickListener(listener);
    }
}