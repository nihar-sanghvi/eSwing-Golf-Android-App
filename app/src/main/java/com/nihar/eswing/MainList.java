package com.nihar.eswing;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class MainList extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);

        ImageButton pair = (ImageButton) findViewById(R.id.imageButton);
        pair.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), PairDevice.class);
                startActivityForResult(intent, 0);
            }
        });

        ImageButton player = (ImageButton) findViewById(R.id.imageButton2);
        player.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), PlayerAdd.class);
                startActivityForResult(intent, 0);
            }
        });

        ImageButton club = (ImageButton) findViewById(R.id.imageButton3);
        club.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ClubAdd.class);
                startActivityForResult(intent, 0);
            }
        });

        ImageButton visualization = (ImageButton) findViewById(R.id.imageButton4);
        visualization.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Visualization.class);
                startActivityForResult(intent, 0);
            }
        });

        ImageButton report = (ImageButton) findViewById(R.id.imageButton5);
        report.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), GenerateReport.class);
                startActivityForResult(intent, 0);
            }
        });

        ImageButton account = (ImageButton) findViewById(R.id.imageButton6);
        account.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), PersonalInfo.class);
                startActivityForResult(intent, 0);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_list, menu);
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
