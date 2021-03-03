package com.example.delivered;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.royrodriguez.transitionbutton.TransitionButton;

public class LoginActivity extends AppCompatActivity {

    private TextView tv_2;
    private TextView tv_3;
    private TextView tv_5,tv_6;
    private TransitionButton transitionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tv_2 = findViewById(R.id.tv_2);
//        tv_2.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        AssetManager mgr = getAssets();
        Typeface tf = Typeface.createFromAsset(mgr, "ahronbd.ttf");
        tv_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this,"Privacy Notice is still building.",Toast.LENGTH_SHORT).show();
            }
        });
        tv_2.setTypeface(tf);


        tv_3 = findViewById(R.id.tv_3);
        tv_3.setTypeface(tf);
        tv_5 = findViewById(R.id.tv_5);
        tv_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this,"Sign up is still building.",Toast.LENGTH_SHORT).show();
            }
        });
        tv_5.setTypeface(tf);

        tv_6 = findViewById(R.id.tv_6);
        tv_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this,"User Guide is still building.",Toast.LENGTH_SHORT).show();
            }
        });
        tv_6.setTypeface(tf);

        transitionButton = findViewById(R.id.transitionButton);
        transitionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the loading animation when the user tap the button
                transitionButton.startAnimation();
                // Do your networking task or background work here.
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        boolean isSuccessful = true;
                        // Choose a stop animation if your call was successful or not
                        if (isSuccessful) {
                            transitionButton.stopAnimation(TransitionButton.StopAnimationStyle.EXPAND, new TransitionButton.OnAnimationStopEndListener() {
                                @Override
                                public void onAnimationStopEnd() {
                                    Toast.makeText(LoginActivity.this,"Successfully Sign in.",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(getBaseContext(), HomePageActivity.class);
                                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                                    LoginActivity.this.finish();
                                    startActivity(intent);
                                }
                            });
                        } else {
                            transitionButton.stopAnimation(TransitionButton.StopAnimationStyle.SHAKE, null);
                        }
                    }
                }, 1000);
            }
        });
        transitionButton.setTypeface(tf);

    }
}
