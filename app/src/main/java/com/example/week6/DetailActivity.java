package com.example.week6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView imgViewMakanan;
    TextView txtViewJudul, txtViewisi;

    String namaMakanan, infoMakanan;
    int fotoMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtViewJudul = findViewById(R.id.txtViewJudul);
        txtViewisi = findViewById(R.id.txtViewisi);
        imgViewMakanan = findViewById(R.id.imgViewMakanan);

        // foto makanan
        Bundle bundle =  getIntent().getExtras();
        fotoMakanan = bundle.getInt(String.valueOf("foto_makanan"));
        imgViewMakanan.setImageResource(fotoMakanan);

        getInputExtra();
    }

    private void getInputExtra(){
        namaMakanan = getIntent().getStringExtra("nama_makanan");
        infoMakanan = getIntent().getStringExtra("info_makanan");

        setDataActivity(namaMakanan, infoMakanan);
    }

    private void setDataActivity(String namaMakanan, String infoMakanan){
        txtViewJudul.setText(namaMakanan);
        txtViewisi.setText(infoMakanan);
    }
}