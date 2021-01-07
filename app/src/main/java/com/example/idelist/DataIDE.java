package com.example.idelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DataIDE extends AppCompatActivity {
    ImageView data_logo;
    TextView data_nama;
    TextView data_penj;
    TextView data_developer;
    TextView data_bahasa_pemrograman;
    Button btn_download;
    String link;
    List<ModelIDE> ideList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_ide);

        data_logo = (ImageView) findViewById(R.id.data_logo);
        data_nama = (TextView) findViewById(R.id.data_nama);
        data_penj = (TextView) findViewById(R.id.data_penjelasan);
        data_developer = (TextView) findViewById(R.id.data_developer);
        data_bahasa_pemrograman = (TextView) findViewById(R.id.data_bahasa_pemrograman);
        btn_download = (Button) findViewById(R.id.btn_download);

        // Disini data yang dikirimkan oleh activity sebelumnya diambil
        // Dan di masukan ke sebuah variabel
        int id = getIntent().getExtras().getInt("id_IDE");
        link = "https://www.google.com";
        // Disini variabel  ideList dimasukkan data
        // Sesuai dengan isi ideList yang ada di class IDEAdapter
        ideList = IDEAdapter.ideList;

        // Disini data di set berdasarkan data dari ID yang di kirimkan dari activity sebelumnya
        data_logo.setImageDrawable(this.getResources().getDrawable(ideList.get(id).getLogo()));
        data_nama.setText(ideList.get(id).getNama());
        data_penj.setText(ideList.get(id).getPenjelasan());
        data_developer.setText(ideList.get(id).getDeveloper());
        data_bahasa_pemrograman.setText(ideList.get(id).getBahasapemrograman());
        link = ideList.get(id).getLink();

        btn_download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Saat tombol di klik maka akan membuka browser dan menuju link yang telah dimasukkan
                Intent bukaBrowser = new Intent(Intent.ACTION_VIEW);
                bukaBrowser.setData(Uri.parse(link));
                startActivity(bukaBrowser);
            }
        });
    }
}