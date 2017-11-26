package de.programmierenlernenhq.reha_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class activity_menue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menue);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public void nextActivity (View view){
        Intent intent = new Intent(activity_menue.this, activity_tp_erstellen.class);
        startActivity(intent);
    }

    public void patSuche (View view) {
        Intent intent = new Intent(activity_menue.this, activity_pat_suche.class);
        startActivity(intent);
    }

}
