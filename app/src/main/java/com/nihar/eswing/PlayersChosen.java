package com.nihar.eswing;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class PlayersChosen extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_chosen);
//        Intent intent = getIntent();
//        String chosenPlayers = intent.getStringExtra("parameter name");
//        TextView txtChosenPlayers = (TextView)findViewById(R.id.PlayersChosen);
//        Button btn = (Button)findViewById(R.id.button3);
//        txtChosenPlayers.setText(""+chosenPlayers);
//        btn.setText(""+chosenPlayers);

//        Intent intent = getIntent();
//
//        ArrayList<String> chosenPlayers = intent.getStringArrayListExtra("parameter name");
//        Button btn3 = (Button)findViewById(R.id.button3);
//        btn3.setText(""+chosenPlayers);

        Intent intent = getIntent();

        ArrayList<String> chosenPlayers = intent.getStringArrayListExtra("parameter name");
        Button btn3 = (Button)findViewById(R.id.button3);
        Button btn4 = (Button)findViewById(R.id.button4);
        Button btn5 = (Button)findViewById(R.id.button5);
        int size = chosenPlayers.size();
        String final_player_selection ="";
        if(size==3){
        btn3.setText(""+chosenPlayers.get(0));
        btn4.setText(""+chosenPlayers.get(1));
        btn5.setText(""+chosenPlayers.get(2));
        }
        if(size==2){
            btn3.setText(""+chosenPlayers.get(0));
            btn4.setText(""+chosenPlayers.get(1));
            btn5.setVisibility(View.INVISIBLE);
        }
        if(size==1){
            btn3.setText(""+chosenPlayers.get(0));
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_players_chosen, menu);
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
