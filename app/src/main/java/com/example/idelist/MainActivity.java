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
    List<ModelIDE> ideList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ideList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.list_ide);

        ideList.add(new ModelIDE(R.drawable.logo_android_studio, "Android Studio"));
        ideList.add(new ModelIDE(R.drawable.logo_eclipse, "Eclipse IDE"));
        ideList.add(new ModelIDE(R.drawable.logo_netbeans, "Netbeans"));
        ideList.add(new ModelIDE(R.drawable.logo_visual_studio, "Microsoft Visual Studio"));

        IDEAdapter adapter = new IDEAdapter(this, R.layout.item_list, ideList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String namaIDE = ideList.get(position).nama;

                Intent intent = new Intent(MainActivity.this, DataIDE.class);
                intent.putExtra("IDEName", namaIDE);
                startActivity(intent);
            }
        });
    }
}