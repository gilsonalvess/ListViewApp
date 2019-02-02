package com.dwm.ufg.listviewapp;

import android.content.Intent;
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

        final Intent intent = new Intent(this, Main2Activity.class);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(),"Você clicou em: "+ times.get(position).getNome(),Toast.LENGTH_SHORT).show();
                intent.putExtra("time", times.get(position));

                startActivity(intent);
            }
        });

    }

    private ArrayList<Time> preencheDados() {

        ArrayList<Time> listaDeTimes = new ArrayList<Time>();

        listaDeTimes.add(new Time("Palmeiras", R.drawable.b_palmeiras));
        listaDeTimes.add(new Time("Gremio", R.drawable.b_gremio));
        listaDeTimes.add(new Time("Santos", R.drawable.b_santos));

       return listaDeTimes;
    }
}
