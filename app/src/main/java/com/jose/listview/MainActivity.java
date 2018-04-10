package com.jose.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.security.Principal;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private String [] opc;
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lstOpciones);
        opc=getResources().getStringArray(R.array.opciones);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,opc);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        in= new Intent( MainActivity.this,registar.class);
                        startActivity(in);
                        break;
                    case 1:
                        in= new Intent( MainActivity.this,listar.class);
                        startActivity(in);
                        break;

                }

            }
        });

    }
}
