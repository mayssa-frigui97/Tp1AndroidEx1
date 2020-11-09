package com.example.tp1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button bconvert;
    private EditText eEntry;
    private TextView titre;
    private RadioButton EuroDinar;
    private RadioButton DinarEuro;
    private TextView moneyConverted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.titre = (TextView) this.findViewById(R.id.titre) ;
        this.moneyConverted = (TextView) this.findViewById(R.id.moneyConverted) ;
        this.eEntry = (EditText) this.findViewById(R.id.e_entry) ;
        this.EuroDinar = (RadioButton) this.findViewById(R.id.EuroDinar) ;
        this.DinarEuro = (RadioButton) this.findViewById(R.id.DinarEuro) ;

    }
    public void convert(View v){
        double result=0;
        double moneyToConvert =Integer.parseInt(eEntry.getText().toString());
        if (DinarEuro.isChecked() ){
            result=moneyToConvert/3.26;
        }
        else if (EuroDinar.isChecked() ){
            result=moneyToConvert*3.26;
        }
        moneyConverted.setText(String.valueOf(result));
    }
}