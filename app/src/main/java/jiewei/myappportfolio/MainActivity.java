package jiewei.myappportfolio;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

    public void onClick(View v){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text;
        Toast toast;
        switch(v.getId()){
            case R.id.button_label_spotify_streamer:
                text = "This button will launch Spotify Streamer!";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.button_label_scores_app:
                text = "This button will launch Scores App!";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.button_label_library_app:
                text = "This button will launch Library App!";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.button_label_build_it_bigger:
                text = "This button will launch Build It Bigger!";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.button_label_xyz_reader:
                text = "This button will launch XYZ Reader!";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.button_label_capstone:
                text = "This button will launch my capstone app!";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;


        }


    }
}
