package com.kh09909.random_photo;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends WearableActivity implements View.OnClickListener {

    Button btn1;
    Button btn2;

    String url = "http://lorempixel.com/320/320/";

    ImageView imageView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Enables Always-on
        setAmbientEnabled();



        imageView  = (ImageView) findViewById(R.id.imageView);


        Picasso.with(this).load(url).into(imageView);


        btn1 = (Button) findViewById(R.id.update);

        btn1.setOnClickListener(this);

//        btn2 = (Button) findViewById(R.id.btn2);
//
//        btn2.setOnClickListener(this);
    }


    public void btn1(){
        url = "http://lorempixel.com/320/320/";
    }


    public void onClick(View v) {

        switch (v.getId()) {


            case R.id.update:
                btn1();
                break;

            default:
                break;

        }

    }

}
