package com.example.administrator.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_listview = (Button)findViewById(R.id.btn_listview);
        Button btn_alertdialog = (Button)findViewById(R.id.btn_alertdialog);
        Button btn_xml = (Button)findViewById(R.id.btn_xml);
        Button btn_actionmode = (Button)findViewById(R.id.btn_actionmode);
        btn_listview.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AndroidListView.class);
                startActivity(intent);
            }
        });
        btn_alertdialog.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AndroidAlertDialog.class);
                startActivity(intent);
            }
        });
        btn_xml.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AndroidXML.class);
                startActivity(intent);
            }
        });
        btn_actionmode.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AndroidActionMode.class);
                startActivity(intent);
            }
        });
    }
}
