package com.example.joey.majikcreen;

import android.graphics.Typeface;
import android.net.Uri;
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

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


public class MainActivity extends AppCompatActivity {


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final RelativeLayout rl = new RelativeLayout(this);
        rl.setBackgroundColor(Color.rgb(0, 80, 128));

        //relative layout for button click
        final RelativeLayout afterClick = new RelativeLayout(this);
        afterClick.setBackgroundColor(Color.rgb(139, 134, 130));
        RelativeLayout.LayoutParams clickButton = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        clickButton.addRule(RelativeLayout.CENTER_HORIZONTAL);
        clickButton.topMargin = 274;
        TextView displayMessage = new TextView(this);
        displayMessage.setText("Choose your message type:\n");
        displayMessage.setTextColor(Color.BLACK);
        displayMessage.setTextSize(40);
        displayMessage.setTypeface(Typeface.SERIF);
        RelativeLayout.LayoutParams displayBDetails = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        displayBDetails.addRule(RelativeLayout.CENTER_VERTICAL + 1);
        displayBDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        afterClick.addView(displayMessage, displayBDetails);



        //messageDButton
        Button messageDButton = new Button(this);
        messageDButton.setText("Send Dr. Daniels a message!");
        messageDButton.setBackgroundColor(Color.rgb(131, 139, 131));
        messageDButton.setTextColor(Color.WHITE);
        messageDButton.setId(1);
        messageDButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(afterClick);
            }
        });

        //Relative Layout for Home Screen
        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL - 1);
        buttonDetails.topMargin = 274;
        rl.addView(messageDButton, buttonDetails);


        //display message
        TextView displayHours = new TextView(this);
        displayHours.setText("\n\n  Dr. Daniels Office Hours:\n        M W F 10:00 - 11:00 \n             Th 3:00 - 5:00");
        displayHours.setTextColor(Color.BLACK);
        displayHours.setTextSize(40);
        displayHours.setTypeface(null, Typeface.BOLD);
        displayHours.setTypeface(Typeface.SERIF);
        RelativeLayout.LayoutParams displayDetails = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        displayDetails.addRule(RelativeLayout.CENTER_VERTICAL + 1);
        displayDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        rl.addView(displayHours, displayDetails);



        //creates the return or back button to home screen
        Button returnButton = new Button(this);
        returnButton.setText("Return to Home");
        returnButton.setBackgroundColor(Color.BLACK);
        returnButton.setTextColor(Color.WHITE);
        returnButton.setId(2);

        //Relative Layout for Home Screen
        RelativeLayout.LayoutParams returnButtonDetails = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        returnButtonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL - 2);
        returnButtonDetails.addRule(RelativeLayout.CENTER_VERTICAL - 1);
        returnButtonDetails.topMargin = 274;
        afterClick.addView(returnButton, returnButtonDetails);

        returnButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(rl);
            }
        });



         setContentView(rl);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
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
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.joey.majikcreen/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.joey.majikcreen/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
