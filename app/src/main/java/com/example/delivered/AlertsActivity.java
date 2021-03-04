package com.example.delivered;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AlertsActivity extends AppCompatActivity {

    private TextView tv_2,tv_3,tv_7,tv_8,tv_9,tv_10,tv_11,tv_12,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6;

    private TextView mainpage,nowlocation,account,notification;

    private TextView home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerts);

        final AssetManager mgr = getAssets();
        Typeface tf = Typeface.createFromAsset(mgr, "ahronbd.ttf");

        tv_3 = findViewById(R.id.tv_3);
        tv_3.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        tv_3.setTypeface(tf);

        tv_7 = findViewById(R.id.tv_7);
        tv_7.setTypeface(tf);
        tv_8 = findViewById(R.id.tv_8);
        tv_8.setTypeface(tf);
        tv_9 = findViewById(R.id.tv_9);
        tv_9.setTypeface(tf);
        tv_10 = findViewById(R.id.tv_10);
        tv_10.setTypeface(tf);
        tv_11 = findViewById(R.id.tv_11);
        tv_11.setTypeface(tf);
        tv_12 = findViewById(R.id.tv_12);
        tv_12.setTypeface(tf);
        btn_1 = findViewById(R.id.btn_1);
        btn_1.setTypeface(tf);
        btn_2 = findViewById(R.id.btn_2);
        btn_2.setTypeface(tf);
        btn_3 = findViewById(R.id.btn_3);
        btn_3.setTypeface(tf);
        btn_4 = findViewById(R.id.btn_4);
        btn_4.setTypeface(tf);
        btn_5 = findViewById(R.id.btn_5);
        btn_5.setTypeface(tf);
        btn_6 = findViewById(R.id.btn_6);
        btn_6.setTypeface(tf);

        notification = findViewById(R.id.notification);
        mainpage = findViewById(R.id.mainpage);
        mainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair pair1 = new Pair<>(mainpage, ViewCompat.getTransitionName(mainpage));
                Pair pair2 = new Pair<>(nowlocation, ViewCompat.getTransitionName(nowlocation));
                Pair pair3 = new Pair<>(notification, ViewCompat.getTransitionName(notification));
                ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(AlertsActivity.this, pair1, pair2, pair3);
                Intent intent = new Intent(AlertsActivity.this, HomePageActivity.class);
                ActivityCompat.startActivity(AlertsActivity.this, intent, transitionActivityOptions.toBundle());
            }
        });


        nowlocation = findViewById(R.id.nowlocation);
        nowlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AlertsActivity.this,"Already in Alerts page.",Toast.LENGTH_SHORT).show();
            }
        });

        account = findViewById(R.id.account);
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair pair1 = new Pair<>(account, ViewCompat.getTransitionName(account));
                Pair pair2 = new Pair<>(nowlocation, ViewCompat.getTransitionName(nowlocation));
                Pair pair3 = new Pair<>(notification, ViewCompat.getTransitionName(notification));
                ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(AlertsActivity.this, pair1, pair2, pair3);
                Intent intent = new Intent(AlertsActivity.this, AccountActivity.class);
                ActivityCompat.startActivity(AlertsActivity.this, intent, transitionActivityOptions.toBundle());
            }
        });

        home = findViewById(R.id.home);
        home.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        home.setTypeface(tf);


    }
}
