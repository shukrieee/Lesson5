package com.example.uitest.uitest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.*;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView t;
    EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        t= (TextView)findViewById(R.id.textView);
        t.setText("test");
        e=(EditText)findViewById(R.id.editText);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void bold(View v){

        Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
        String str=e.getText().toString();
        t.setText(flip(str));


    }

    public String flip(String s)
    {
        String ret="";
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            ret=ret+s.charAt(i);
        }
        return ret;
    }


}
