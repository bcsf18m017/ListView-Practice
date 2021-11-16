package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView l;
    ArrayList<String> data;
    Button btn;
    EditText txt;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data=new ArrayList<>();
        l = findViewById(R.id.list);
        btn=findViewById(R.id.addButton);
        txt=findViewById(R.id.textValue);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, data);
        l.setAdapter(arr);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.add(txt.getText().toString());
                arr.notifyDataSetChanged();
                txt.setText("");
            }
        });
    }
}