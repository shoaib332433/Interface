package com.example.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    Kickboxer obj=new Kickboxer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn=findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,obj.throwhook() +"" ,Toast.LENGTH_SHORT).show();
            }
        });







    }


}
