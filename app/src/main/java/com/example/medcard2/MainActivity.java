package com.example.medcard2;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonPressed(View view) {

        switch (view.getId()){
            case (R.id.but_card_pat1):
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//        intent.putExtra("KEY","Play");
                intent.putExtra("Key", "Pat1");
                startActivity(intent);
                break;
        }

        switch (view.getId()){
            case (R.id.but_card_pat2):
                Intent intent = new Intent(this, SecondActivity.class);
//        intent.putExtra("KEY","Play");
                Bundle bundle = new Bundle();
                bundle.putString("Key","Pat2");
                intent.putExtras(bundle);
                startActivity(intent);
                break;
        }

        switch (view.getId()){
            case (R.id.but_card_pat3):
                Intent intent = new Intent(this, SecondActivity.class);
//        intent.putExtra("KEY","Play");
                Bundle bundle = new Bundle();
                bundle.putString("Key","Pat3");
                intent.putExtras(bundle);
                startActivity(intent);
                break;
        }

    }

}
