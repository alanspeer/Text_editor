package com.example.a2speea07.text_editor;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == R.id.save)
        {
            try
            {
                PrintWriter pw =
                        new PrintWriter(new FileWriter("data.txt"));

                EditText et = (EditText) findViewById(R.id.TextField);
                pw.println(et.getText().toString());
                pw.close();
            } catch (IOException e)
            {
                new AlertDialog.Builder(this).setMessage("ERROR: " + e).
                        setPositiveButton("OK", null).show();
            }
            return true;
        }


        if (item.getItemId() == R.id.load)
        {
            try
            {
                BufferedReader reader = new BufferedReader(new FileReader("marks.txt"));
            }

        }
    }


}

