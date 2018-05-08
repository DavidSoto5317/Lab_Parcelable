package com.example.david.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

//import com.google.gson.Gson;

public class Activity_a extends AppCompatActivity {

    public static final String PARCELABLE_ITEM = "com.example.david.parcelable_item";
    //public static final String GSON_ITEM = "com.example.david.gson_item";
    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.listView);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.listado, android.R.layout.simple_list_item_1);
        lista.setAdapter(adaptador);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_a.this, Activity_b.class);

                direccion anidado = new direccion(28,30,5);
                usuario obj = new usuario("David", 19, 56934376, anidado);
                intent.putExtra(PARCELABLE_ITEM, obj);

//                Gson gson = new Gson();
//                JsonItem jsonItem = new JsonItem("name",20,"hola");
//                String gsonVal = gson.toJson(new JsonItem("name",20,"hola"));
//                String gsonVal = gson.toJson(jsonItem);
//                intent.putExtra(GSON_ITEM,gsonVal);

                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
