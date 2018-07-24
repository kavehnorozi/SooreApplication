package ir.ac.soore.sooreapplication.activity;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


import ir.ac.soore.sooreapplication.R;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout drawer;
    Button btn_colege;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = (DrawerLayout) findViewById(R.id.drawer_main);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(MainActivity.this, drawer, toolbar, R.string.open, R.string.close);
        toggle.syncState();

        btn_colege=(Button)findViewById(R.id.btn_college_list);
        btn_colege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),UnivercitiesActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_bottom_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
