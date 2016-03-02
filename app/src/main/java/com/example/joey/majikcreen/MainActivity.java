package com.example.joey.majikcreen;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout rl = new RelativeLayout(this);
        rl.setBackgroundColor(Color.rgb(120,145,225));

        Button messageDButton = new Button(this);
        messageDButton.setText("Send Dr. Daniels a message!");
        messageDButton.setBackgroundColor(Color.BLACK);
        messageDButton.setTextColor(Color.WHITE);
        messageDButton.setId(1);

        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.topMargin = 274;
        rl.addView(messageDButton, buttonDetails);

        TextView displayHours = new TextView(this);
        displayHours.setText("Dr. Daniels Office Hours:\nM W F 10:00 - 11:00 \nTh 3:00 - 5:00");
        displayHours.setTextColor(Color.BLACK);
        displayHours.setTextSize(40);
        RelativeLayout.LayoutParams displayDetails = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        displayDetails.addRule(RelativeLayout.CENTER_VERTICAL+1);
        displayDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        rl.addView(displayHours, displayDetails);


        setContentView(rl);
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
