package com.example.final_videojuegos_meneses;

import androidx.appcompat.app.AppCompatActivity;

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

public class detailActivity extends AppCompatActivity {

    private ImageView mIVCapture;

    private static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Button btnRegistrar = findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://upn.lumenes.tk/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                AccountService service = retrofit.create(AccountService.class);

               /* Account account = new Account();
                account.setNombre("Franco");
                account.setMonto(3000.50);
                account.setFechaCreacion("2021-12-01");
                account.setSucursal1();
                account.setSucursal2();
                account.setSucursal3();
                account.setImagen();
                service.create();*/
            }
        });

        mIVCapture = findViewById(R.id.idCapture);
        Button btnOpenCamera = findViewById(R.id.btnOpenCamera);
        btnOpenCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(detailActivity.this.checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
                    detailActivity.this.requestPermissions(new String[]{Manifest.permission.CAMERA}, 10001);

                }
                else
                {
                    takePicture();
                }


            }
        });
    }

    public void takePicture() {
        Intent imageTakeIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        if(imageTakeIntent.resolveActivity(getPackageManager())!=null){
            startActivityForResult(imageTakeIntent,REQUEST_IMAGE_CAPTURE);

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);

        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK)
        {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            mIVCapture.setImageBitmap(imageBitmap);
        }

    }
}