package com.nihar.eswing;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;


public class PlayerAdd extends ActionBarActivity {

    ArrayList<String> selection = new ArrayList<String>();
    TextView final_text;
    TextView youHaveChosen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_add);
         final_text= (TextView)findViewById(R.id.result);
        youHaveChosen= (TextView)findViewById(R.id.textView22);


        Button select_player_button = (Button) findViewById(R.id.button7);
        final_text.setEnabled(false);
        //Button select_player_button = (Button) findViewById(R.id.button7);
//        select_player_button.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//                Intent intent = new Intent(v.getContext(), PlayersChosen.class);
//                startActivityForResult(intent, 0);
//
//            }
//        });

        Button addPlayer = (Button) findViewById(R.id.button12);
        addPlayer.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SignUp.class);
                startActivityForResult(intent, 0);

            }
        });
    }



    public void selectPlayer(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.checkBox6:
                if(checked)
                {selection.add("Player 1");}
                else
                {selection.remove("Player1");}
                break;

            case R.id.checkBox7:
                if(checked)
                {selection.add("Player 2");}
                else
                {selection.remove("Player2");}
                break;

            case R.id.checkBox8:
                if(checked)
                {selection.add("Player 3");}
                else
                {selection.remove("Player3");}
                break;
        }
    }

    public void playerSelected(View view){

//        String final_player_selection ="";
//        for (String Selections : selection)
//        {
//            final_player_selection = final_player_selection + Selections + "\n";
//
//        }
//
//        Intent intent = new Intent(PlayerAdd.this, PlayersChosen.class);
//        intent.putExtra("parameter name", final_player_selection);
//        startActivity(intent);

//        Intent intent = new Intent(PlayerAdd.this, PlayersChosen.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
//       intent.putStringArrayListExtra("parameter name", selection);
//        startActivity(intent);
//        finish();

        Intent intent = new Intent(PlayerAdd.this, PlayersChosen.class);
        intent.putStringArrayListExtra("parameter name", selection);
        startActivity(intent);
        finish();




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_player_add, menu);
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
