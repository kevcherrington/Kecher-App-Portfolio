package com.kecher.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void launchSpotify(View view) {
        Toast.makeText(getApplicationContext(), R.string.spotify_toast, Toast.LENGTH_LONG).show();
    }

    public void launchScoresApp(View view) {
        Toast.makeText(getApplicationContext(), R.string.scores_toast, Toast.LENGTH_LONG).show();
    }

    public void launchLibraryApp(View view) {
        Toast.makeText(getApplicationContext(), R.string.library_toast, Toast.LENGTH_LONG).show();
    }

    public void launchBuildItBigger(View view) {
        Toast.makeText(getApplicationContext(), R.string.build_it_bigger_toast, Toast.LENGTH_LONG).show();
    }

    public void launchXYZReader(View view) {
        Toast.makeText(this, R.string.xyz_reader_toast, Toast.LENGTH_LONG).show();
    }

    public void launchCapstone(View view) {
        Toast.makeText(this, R.string.capstone_toast, Toast.LENGTH_LONG).show();
    }
}
