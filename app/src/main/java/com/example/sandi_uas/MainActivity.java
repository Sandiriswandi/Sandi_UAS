package com.example.sandi_uas;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton btnDarat,btnAir;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnDarat = findViewById(R.id.btn_buka_ras_Darat);
        btnAir = findViewById(R.id.btn_buka_ras_Air);
        btnDarat.setOnClickListener(view -> bukaGaleri("Darat"));
        btnAir.setOnClickListener(view -> bukaGaleri("Air"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, com.program.tugaslist_sandi.DaftarKulinerActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

}