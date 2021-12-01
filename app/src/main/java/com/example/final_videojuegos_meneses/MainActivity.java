package com.example.final_videojuegos_meneses;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompatSideChannelService;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.final_videojuegos_meneses.entities.Account;
import com.example.final_videojuegos_meneses.services.AccountService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRegistrarAccount = findViewById(R.id.btnRegistrar);
        btnRegistrarAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),detailActivity.class);

                startActivity(intent);
            }
        });

        Button btnSincronizarAccount = findViewById(R.id.btnSincronizar);

        Button btnMostrarAccount = findViewById(R.id.btnMostrar);




    }



}