package com.udacity.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Main Activity to show th dashboard for all apps
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initAllButtons();

    }

    /**
     * To initialize the views
     */
    private void initAllButtons() {

        findViewById(R.id.app_spotify_streamer).setOnClickListener(this);
        findViewById(R.id.app_scores).setOnClickListener(this);
        findViewById(R.id.app_library).setOnClickListener(this);
        findViewById(R.id.app_build_it_bigger).setOnClickListener(this);
        findViewById(R.id.app_my_own).setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        int message = -1;
        switch (v.getId()){

            case R.id.app_spotify_streamer :
                message =R.string.spotify_streamer;
                break;
            case R.id.app_scores :
                message =R.string.scores_app;
                break;
            case R.id.app_library :
                message =R.string.library_app;
                break;
            case R.id.app_build_it_bigger :
                message =R.string.build_it_bigger;
                break;
            case R.id.app_xyz_reader :
                message =R.string.xyz_reader;
                break;
            case R.id.app_my_own :
                message =R.string.my_own_app;
                break;
        }

        Toast.makeText(MainActivity.this, "This button will launch "+getString(message), Toast.LENGTH_SHORT).show();



    }
}
