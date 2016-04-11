package com.maddog05.demoprogressdialog;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.maddog05.maddogdialogs.MaddogProgressDialog;

public class MainActivity extends AppCompatActivity {

    private ProgressDialog progress;
    private MaddogProgressDialog maddogProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progress = new ProgressDialog(MainActivity.this);
        progress.setIndeterminate(true);
        progress.setTitle("Hello");
        progress.setMessage("I am maddog05");

        maddogProgressDialog = new MaddogProgressDialog(MainActivity.this);
        maddogProgressDialog.setTheme(R.style.DialogTheme);
        maddogProgressDialog.setTitle("Hello!");
        maddogProgressDialog.setMessage("I am maddog05");
        maddogProgressDialog.setCancelable(false);
        maddogProgressDialog.setAccentColor(Color.parseColor("#F44336"));
        maddogProgressDialog.setTypefaceTitle(Typeface.createFromAsset(getAssets(),"CabinCondensed-Bold.ttf"));
        maddogProgressDialog.setTypefaceMessage(Typeface.createFromAsset(getAssets(),"CabinCondensed-Regular.ttf"));
    }

    public void showDialog(View v)
    {
        if(maddogProgressDialog != null)
        {
            maddogProgressDialog.show();
            CountDownTimer timer = new CountDownTimer(2000,1000) {
                @Override
                public void onTick(long millisUntilFinished) {

                }

                @Override
                public void onFinish() {
                    if(maddogProgressDialog != null)
                        maddogProgressDialog.dismiss();
                }
            };
            timer.start();
        }

        /*if(progress != null && !progress.isShowing())
            progress.show();
        CountDownTimer timer = new CountDownTimer(2000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                if(progress != null && progress.isShowing())
                    progress.dismiss();
            }
        };
        timer.start();*/
    }
}
