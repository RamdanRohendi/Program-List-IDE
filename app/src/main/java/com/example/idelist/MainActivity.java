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

        ideList.add(new ModelIDE(1, R.drawable.logo_android_studio, getString(R.string.nama_andstu), getString(R.string.penj_andstu), getString(R.string.dev_andstu), getString(R.string.prog_andstu), getString(R.string.link_andstu)));
        ideList.add(new ModelIDE(2, R.drawable.logo_eclipse, getString(R.string.nama_eclipse), getString(R.string.penj_eclipse), getString(R.string.dev_eclipse), getString(R.string.prog_eclipse), getString(R.string.link_eclipse)));
        ideList.add(new ModelIDE(3, R.drawable.logo_netbeans, getString(R.string.nama_netbeans), getString(R.string.penj_netbeans), getString(R.string.dev_netbeans), getString(R.string.prog_netbeans), getString(R.string.link_netbeans)));
        ideList.add(new ModelIDE(4, R.drawable.logo_visual_studio, getString(R.string.nama_vs), getString(R.string.penj_vs), getString(R.string.dev_vs), getString(R.string.prog_vs), getString(R.string.link_vs)));

        IDEAdapter adapter = new IDEAdapter(this, R.layout.item_list, ideList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int id_IDE = ideList.get(position).getId() - 1;

                Intent intent = new Intent(MainActivity.this, DataIDE.class);
                intent.putExtra("id_IDE", id_IDE);
                startActivity(intent);
            }
        });
    }
}