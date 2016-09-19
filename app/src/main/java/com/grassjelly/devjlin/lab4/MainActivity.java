package com.grassjelly.devjlin.lab4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMap(View view) {
        Uri country = Uri.parse("geo:0,0?q=" + getString(R.string.country) );
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(country);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);

    }

}
