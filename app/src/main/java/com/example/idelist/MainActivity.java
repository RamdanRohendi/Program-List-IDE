package com.example.idelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // Deklarasi Variabel
    List<ModelIDE> ideList; // Pendeklarasian variabel ideList dengan tipe data List
    ListView listView; // Pendeklarasian variabel listView dengan tipe data ListView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi Variabel
        ideList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.list_ide);

        // Berikut adalah kode untuk memasukkan sebuah nilai ke variabel ideList
        // Yang bertipe data List
        ideList.add(new ModelIDE(1, R.drawable.logo_android_studio, getString(R.string.nama_andstu), getString(R.string.penj_andstu), getString(R.string.dev_andstu), getString(R.string.prog_andstu), getString(R.string.link_andstu)));
        ideList.add(new ModelIDE(2, R.drawable.logo_eclipse, getString(R.string.nama_eclipse), getString(R.string.penj_eclipse), getString(R.string.dev_eclipse), getString(R.string.prog_eclipse), getString(R.string.link_eclipse)));
        ideList.add(new ModelIDE(3, R.drawable.logo_netbeans, getString(R.string.nama_netbeans), getString(R.string.penj_netbeans), getString(R.string.dev_netbeans), getString(R.string.prog_netbeans), getString(R.string.link_netbeans)));
        ideList.add(new ModelIDE(4, R.drawable.logo_visual_studio, getString(R.string.nama_vs), getString(R.string.penj_vs), getString(R.string.dev_vs), getString(R.string.prog_vs), getString(R.string.link_vs)));

        // Disini adalah pendeklarasian variabel adapter
        // Dengan tipe data IDEAdapter
        IDEAdapter adapter = new IDEAdapter(this, R.layout.item_list, ideList);
        listView.setAdapter(adapter); // Ini adalah kode dimana si listView meng set sebuah adapter

        // Kode ini berlaku apabila ada item dari listView yang di click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Setelah diclick sebuah variabel diinisialisasikan
                // Lalu dimasukkan nilai
                // Nilai yang dimasukkan adalah nilai id dari item yang diclick
                int id_IDE = ideList.get(position).getId() - 1;

                // Ini adalah pendeklarasian sebuah Intent
                Intent intent = new Intent(MainActivity.this, DataIDE.class);
                // ini adalah data yang akan dikirimkan ke sebuah Activity
                // Intent dengan extra
                intent.putExtra("id_IDE", id_IDE);
                startActivity(intent);
            }
        });
    }
}