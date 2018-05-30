package com.larapin.belajarapi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.larapin.belajarapi.adapter.MahasiswaAdapter;
import com.larapin.belajarapi.model.Mahasiswa;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] nama = new String[]{
                "avin", "riyan", "triyanto"
        };

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Avin");
        mahasiswa1.setNim("3.34.15.1.06");
        mahasiswa1.setEmail("avin@mail.com");
        mahasiswa1.setFoto("http://192.168.43.171:8080/gambar/avin.png");

        Mahasiswa mahasiswa2 = new Mahasiswa(
                "riyan",
                "3.34.15.1.1",
                "mail#mail.com",
                "http://192.168.43.171:8080/gambar/egg.png"
        );

        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
        mahasiswas.add(mahasiswa1);
        mahasiswas.add(mahasiswa2);

        MahasiswaAdapter mahasiswaAdapter = new MahasiswaAdapter(this, R.layout.item_mahasiswa, mahasiswas);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, nama);


        ListView lvNama = (ListView)findViewById(R.id.list_mahasiswa);
        lvNama.setAdapter(mahasiswaAdapter);

    }
}
