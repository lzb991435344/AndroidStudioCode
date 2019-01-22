package com.example.administrator.myservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

    //method to start the service
    public void startService(View view){
        startService(new Intent(getBaseContext(), MyService.class));
    }

    //method to stop the service
    public void stopService(View view){
        stopService(new Intent(getBaseContext(), MyService.class));
    }
}
