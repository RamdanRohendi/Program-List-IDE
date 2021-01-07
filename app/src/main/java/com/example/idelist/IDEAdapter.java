package com.example.idelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class IDEAdapter extends ArrayAdapter<ModelIDE> {
    static List<ModelIDE> ideList;
    Context context;
    int resource;

    public IDEAdapter(Context context, int resource, List<ModelIDE> ideList) {
        super(context, resource, ideList);
        this.context = context;
        this.resource = resource;
        this.ideList = ideList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(resource, null, false);

        ImageView logo = view.findViewById(R.id.icon_ide);
        TextView nama = view.findViewById(R.id.nama_ide);

        ModelIDE ide = ideList.get(position);

        logo.setImageDrawable(context.getResources().getDrawable(ide.getLogo()));
        nama.setText(ide.getNama());

        return view;
    }
}
