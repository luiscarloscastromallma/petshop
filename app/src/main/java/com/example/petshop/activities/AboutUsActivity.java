package com.example.petshop.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.petshop.MainActivity;
import com.example.petshop.R;
import com.example.petshop.generals.Settings;

public class AboutUsActivity extends AppCompatActivity {
    Button imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        imageView = (Button) findViewById(R.id.ButtonTest);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i(Settings.INFO, "Products");
                Intent i = new Intent(AboutUsActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }

}
