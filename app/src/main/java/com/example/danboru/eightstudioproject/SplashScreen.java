package com.example.danboru.eightstudioproject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);


        final Thread thread = new Thread(){

            public void run(){

                try{

                    sleep(3000);
                    Intent splash = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(splash);
                    finish();

                }catch(Exception e){

                    e.printStackTrace();

                }

            }

        };

        thread.start();

    }
}
