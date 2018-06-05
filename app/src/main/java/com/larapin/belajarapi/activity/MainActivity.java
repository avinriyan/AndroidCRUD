package com.larapin.belajarapi.activity;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.larapin.belajarapi.R;
import com.larapin.belajarapi.adapter.MahasiswaAdapter;
import com.larapin.belajarapi.model.Mahasiswa;
import com.larapin.belajarapi.model.MahasiswaResult;
import com.larapin.belajarapi.network.APIClient;
import com.larapin.belajarapi.network.MahasiswaService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 1 : load data JSON pake retrofit
        MahasiswaService service = APIClient.getRetrofit().create(MahasiswaService.class);
        Call<MahasiswaResult> mahasiswas = service.getMahasiswa();
        mahasiswas.enqueue(new Callback<MahasiswaResult>() {
            @Override
            public void onResponse(Call<MahasiswaResult> call, Response<MahasiswaResult> response) {
                    Toast.makeText(MainActivity.this, "Jumlah mahasiswa: " +
                            response.body().getMahasiswas().size(), Toast.LENGTH_SHORT).show();

                    tampilkan(response.body().getMahasiswas());
            }

            @Override
            public void onFailure(Call<MahasiswaResult> call, Throwable t) {

            }
        });

        //TODO 2: tombol fab untuk insert data
        fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FormActivity.class);
                startActivity(intent);
            }
        });
    }

    private void tampilkan(List<Mahasiswa> mahasiswas) {
        MahasiswaAdapter mahasiswaAdapter = new MahasiswaAdapter(this, R.layout.item_mahasiswa, mahasiswas);

        ListView lvNama = (ListView)findViewById(R.id.list_mahasiswa);
        lvNama.setAdapter(mahasiswaAdapter);
    }
}
