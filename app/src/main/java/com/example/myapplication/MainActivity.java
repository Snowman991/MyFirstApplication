package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            }


// Abfrage der Uhrzeit
    // Erzeugen der Instanz Calendar




public String  gettime(){
    Calendar Kalender= Calendar.getInstance();
    SimpleDateFormat datumsformat = new SimpleDateFormat("dd.MM.yyyy");
    String Zeitstempel;
    Zeitstempel = (String)datumsformat.format(Kalender.getTime());

return Zeitstempel;
}


    public void buttonSpeichernOnClick(View v) {
        //Button buttonsave = (Button) v;
        TextView textViewZeitanzeigen= (TextView) findViewById(R.id.textViewZeitanzeigen);
        TextView TextFeld = (TextView) findViewById(R.id.TextFeld) ;
        textViewZeitanzeigen.setText(gettime());
        TextFeld.setText("Hello Here is Bob");

        ((Button) v).setText("Hello From the other Side");




        }






}
