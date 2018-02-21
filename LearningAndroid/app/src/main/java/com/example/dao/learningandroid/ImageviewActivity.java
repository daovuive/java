package com.example.dao.learningandroid;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class ImageviewActivity extends AppCompatActivity {

    RadioButton radioButtonBitcoin;
    RadioButton radioButtonEuro;
    RadioButton radioButtonGold;
    ImageView imageView;
    ImageButton btnBackToMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview);
        
        addControls();
        addEvents();
    }

    private void addEvents() {
        radioButtonBitcoin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    imageView.setImageResource(R.drawable.bitcoin);

            }
        });

        radioButtonEuro.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    imageView.setImageResource(R.drawable.coin_icon);

            }
        });

        radioButtonGold.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    imageView.setImageResource(R.drawable.gold);

            }
        });

    }

    private void addControls() {

        radioButtonBitcoin = (RadioButton) findViewById(R.id.radioButtonBitCoin);
        radioButtonEuro = (RadioButton) findViewById(R.id.radioButtonEuro);
        radioButtonGold = (RadioButton) findViewById(R.id.radioButtonGold);
        imageView = (ImageView) findViewById(R.id.imageView);
        btnBackToMain = (ImageButton) findViewById(R.id.imageButton);
        
    }

    public void onBackToMainActivity(View view) {

        Intent intent = null;
        Log.d(MainActivity.LOG_TAG, "Button ImageViewActivity back to main clicked!");
        intent = new Intent(ImageviewActivity.this, MainActivity.class);
        if (intent != null)
            startActivity(intent);
        finish();
    }

}