package com.dwm.ufg.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.lstItem);
        final ArrayList<Time> times =  preencheDados();
        //ArrayAdapter<Time> adaptador = new ArrayAdapter<Time>(this, android.R.layout.simple_list_item_1, times);

        TimeAdapter adaptador = new TimeAdapter(times, this);

        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(),"Você clicou em: "+ times.get(position).getNome(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    private ArrayList<Time> preencheDados() {

        ArrayList<Time> listaDeTime = new ArrayList<Time>();

        listaDeTime.add(new Time("Palmeiras", "b_palmeiras"));
        listaDeTime.add(new Time("Gremio", "b_gremio"));
        listaDeTime.add(new Time("Santos", "b_santos"));

       return listaDeTime;
    }
}
