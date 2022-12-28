package com.utilities.urlopener;


import static android.content.Intent.ACTION_VIEW;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText url;
    private Button open;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        url = findViewById(R.id.editTextTextPersonName);
        open = findViewById(R.id.button);


        open.setOnClickListener(new View.OnClickListener() {

            //  @SuppressLint("QueryPermissionsNeeded")
            @Override
            public void onClick(View v) {
                String urlName = url.getText().toString();
                Uri webpage = Uri.parse(urlName);
                Intent intent = new Intent(ACTION_VIEW, webpage);
            if (intent.resolveActivity(getPackageManager()) != null) {

                    startActivity(intent);
               }
            }
        });

    }
}