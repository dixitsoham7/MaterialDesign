package com.srm.sohamdixit.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Adapter> android;
    private RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.list);
        rv.setHasFixedSize(true);

        LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this);
        rv.setLayoutManager(lm);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null)
            setSupportActionBar(toolbar);

        initializeData();
        initializeAdapter();
    }

    private void initializeData() {
        android = new ArrayList<>();
        android.add(new Adapter("Cupcake"));
        android.add(new Adapter("Donut"));
        android.add(new Adapter("Eclair"));
        android.add(new Adapter("Froyo"));
        android.add(new Adapter("Gingerbread"));
        android.add(new Adapter("Honeycomb"));
        android.add(new Adapter("Icecream Sandwich"));
        android.add(new Adapter("Jellybean"));
        android.add(new Adapter("Kitkat"));
        android.add(new Adapter("Lollipop"));
        android.add(new Adapter("Marshmallow"));
        android.add(new Adapter("Nougat"));
        android.add(new Adapter("Oreo"));
    }

    private void initializeAdapter() {

        RVAdapter adapter = new RVAdapter(android);
        rv.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
