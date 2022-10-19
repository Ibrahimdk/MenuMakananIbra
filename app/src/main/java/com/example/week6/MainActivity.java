package com.example.week6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recKuliner;
    private ArrayList<Kuliner> listkuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recKuliner = findViewById(R.id.rec_kuliner);
        initData();

        recKuliner.setAdapter(new KulinerAdapter(listkuliner));
        recKuliner.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData()
    {
        this.listkuliner = new ArrayList<>();
        listkuliner.add(new Kuliner("Pecel Lele",
                "Rp 25.000",
                "Pecel lele atau pecek lele di Indonesia adalah nama sebuah makanan khas Jawa yang terdiri dari ikan lele dan sambal tomat. Biasanya yang dimaksud adalah ikan lele yang digoreng kering dengan minyak lalu disajikan dengan sambal tomat dan lalapan. Lalapan biasa terdiri dari kemangi, kubis, mentimun, dan kacang panjang.",
                R.drawable.pecel));

        listkuliner.add(new Kuliner("Nasi Goreng Mercon",
                "Rp 30.000",
                "Nasi goreng adalah makanan berupa nasi yang digoreng dan dicampur dalam minyak goreng, margarin atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bahan lainnya; seperti telur, daging ayam, dan kerupuk.",
                R.drawable.nasgor));

        listkuliner.add(new Kuliner("Ayam Geprek Keju",
                "Rp 24.000",
                "Ayam geprek Keju adalah makanan ayam goreng tepung khas Indonesia yang diulek atau dilumatkan bersama sambal bajak dengan toping tambahan keju. Sebagian besar sumber menyebut bahwa ayam geprek berasal dari Kota Yogyakarta. Kini, ayam geprek telah menjadi hidangan populer yang dapat ditemukan di hampir semua kota besar di Indonesia.",
                R.drawable.geprek));

        listkuliner.add(new Kuliner("Kari Ayam",
                "Rp 50.000",
                "Kari ayam adalah hidangan umum di Asia Selatan, Asia Tenggara, serta di Caribbean (di mana makanan tersebut biasa disebut sebagai \"ayam kari\"). Kari ayam di Asia Selatan terdiri dari daging ayam yang direbus dalam bawang bombai dan saus yang berbahan dasar tomat, yang ditambahkan dengan jahe, bawang putih, cabai dan berbagai rempah-rempah.",
                R.drawable.kari));

        listkuliner.add(new Kuliner("Tahu Bulat",
                "Rp 24.000",
                "Tahu bulat adalah sebuah jajanan kaki lima berupa olahan kacang kedelai yang dibuat menjadi sebuah tahu berbentuk bulat dengan isi kopong. Biasanya, tahu bulat dijual di sebuah mobil bak terbuka dan kebanyakan dihargai Rp 500 an dan hangat-hangat.",
                R.drawable.tahubulat));

        listkuliner.add(new Kuliner("Salad Buah",
                "Rp 19.000",
                "Salad buah merupakan sejenis makanan yang berasal dari berbagai buah-buahan kemudian diberi saus olahan dari mayonaise dan susu kental manis. Bagi mereka yang menyukai tentu rasanya sangat nikmat apalagi jika dinikmati dalam kondisi dingin dan hawa diluar sedang panas-panasnya.",
                R.drawable.salad));
    }
}