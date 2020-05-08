package com.example.medcard2;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity   extends AppCompatActivity {
    TextView text_fio;
    TextView text_gender;
    TextView text_birth;
    TextView text_com_date;
    TextView text_diagnoz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        text_fio = findViewById(R.id.text_fio);
        text_gender = findViewById(R.id.text_gender);
        text_birth = findViewById(R.id.text_birth);
        text_com_date = findViewById(R.id.text_com_date);
        text_diagnoz = findViewById(R.id.text_diagnoz);
        if (bundle.getString("Key").equals("Pat1")) {
            text_fio.setText(getResources().getString(R.string.text_fio_pat1));
            text_gender.setText(getResources().getString(R.string.text_gender_male));
            text_birth.setText(getResources().getString(R.string.text_birth_pat1));
            text_com_date.setText(getResources().getString(R.string.text_com_date1));
            text_diagnoz.setText(getResources().getString(R.string.text_diag1));

        }
            else if(bundle.getString("Key").equals("Pat2")){
            text_fio.setText(getResources().getString(R.string.text_fio_pat2));
            text_gender.setText(getResources().getString(R.string.text_gender_female));
            text_birth.setText(getResources().getString(R.string.text_birth_pat2));
            text_com_date.setText(getResources().getString(R.string.text_com_date2));
            text_diagnoz.setText(getResources().getString(R.string.text_diag2));
        }
        else if(bundle.getString("Key").equals("Pat3")){
            text_fio.setText(getResources().getString(R.string.text_fio_pat3));
            text_gender.setText(getResources().getString(R.string.text_gender_male));
            text_birth.setText(getResources().getString(R.string.text_birth_pat3));
            text_com_date.setText(getResources().getString(R.string.text_com_date3));
            text_diagnoz.setText(getResources().getString(R.string.text_diag3));
        }
    }
}
