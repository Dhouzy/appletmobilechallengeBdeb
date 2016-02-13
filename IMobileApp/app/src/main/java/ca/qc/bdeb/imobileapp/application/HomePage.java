package ca.qc.bdeb.imobileapp.application;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.Date;

import ca.qc.bdeb.imobileapp.R;
import ca.qc.bdeb.imobileapp.modele.bluetoothscanner.ListActivity;
import ca.qc.bdeb.imobileapp.modele.objectModel.Question;
import ca.qc.bdeb.imobileapp.modele.objectModel.Questionnaire;
import ca.qc.bdeb.imobileapp.modele.objectModel.QuestionnaireTemplate;
import ca.qc.bdeb.imobileapp.modele.persistence.DbHelper;
import mehdi.sakout.fancybuttons.FancyButton;


public class HomePage extends AppCompatActivity {

    FancyButton btnSend;
    FancyButton btnReceive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        initializeComponent();
        initializeBtnsClick();
    }

    private void initializeComponent() {

        btnSend = (FancyButton) findViewById(R.id.home_page_btn_envoyer);
        btnReceive = (FancyButton) findViewById(R.id.home_page_btn_recevoir);

    }

    private void initializeBtnsClick(){

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, ListActivity.class);
                startActivity(intent);
            }
        });

        btnReceive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, ListActivity.class);
                startActivity(intent);
            }
        });

    }
}
