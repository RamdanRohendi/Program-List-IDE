package com.example.idelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DataIDE extends AppCompatActivity {
    ImageView data_logo;
    TextView data_nama;
    TextView data_penj;
    TextView data_developer;
    TextView data_bahasa_pemrograman;
    Button btn_download;
    String link;

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

        String nama = getIntent().getExtras().getString("IDEName");
        link = "https://www.google.com";

        switch (nama) {
            case "Android Studio":
                data_logo.setImageDrawable(this.getResources().getDrawable(R.drawable.logo_android_studio));
                data_nama.setText(getString(R.string.nama_andstu));
                data_penj.setText(getString(R.string.penj_andstu));
                data_developer.setText(getString(R.string.dev_andstu));
                data_bahasa_pemrograman.setText(getString(R.string.prog_andstu));
                link = getString(R.string.link_andstu);
                break;

            case "Eclipse IDE":
                data_logo.setImageDrawable(this.getResources().getDrawable(R.drawable.logo_eclipse));
                data_nama.setText(getString(R.string.nama_eclipse));
                data_penj.setText(getString(R.string.penj_eclipse));
                data_developer.setText(getString(R.string.dev_eclipse));
                data_bahasa_pemrograman.setText(getString(R.string.prog_eclipse));
                link = getString(R.string.link_eclipse);
                break;

            case "Netbeans":
                data_logo.setImageDrawable(this.getResources().getDrawable(R.drawable.logo_netbeans));
                data_nama.setText(getString(R.string.nama_netbeans));
                data_penj.setText(getString(R.string.penj_netbeans));
                data_developer.setText(getString(R.string.dev_netbeans));
                data_bahasa_pemrograman.setText(getString(R.string.prog_netbeans));
                link = getString(R.string.link_netbeans);
                break;

            case "Microsoft Visual Studio":
                data_logo.setImageDrawable(this.getResources().getDrawable(R.drawable.logo_visual_studio));
                data_nama.setText(getString(R.string.nama_vs));
                data_penj.setText(getString(R.string.penj_vs));
                data_developer.setText(getString(R.string.dev_vs));
                data_bahasa_pemrograman.setText(getString(R.string.prog_vs));
                link = getString(R.string.link_vs);
                break;
        }

        btn_download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bukaBrowser = new Intent(Intent.ACTION_VIEW);
                bukaBrowser.setData(Uri.parse(link));
                startActivity(bukaBrowser);
            }
        });
    }
}