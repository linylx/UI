package com.example.administrator.ui;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class AndroidXML extends Activity {
    private TextView textView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_main);
        textView = (TextView) findViewById(R.id.txt);
        registerForContextMenu(textView);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_plain_menu:
                Toast.makeText(this, "你单击了普通菜单", Toast.LENGTH_LONG).show();
                break;
            case R.id.font_10:
                textView.setTextSize(10);
                break;
            case R.id.font_20:
                textView.setTextSize(20);
                break;
            case R.id.font_30:
                textView.setTextSize(30);
                break;
            case R.id.font_40:
                textView.setTextSize(40);
                break;
            case R.id.red_font:
                textView.setBackgroundColor(Color.RED);
                break;
            case R.id.green_font:
                textView.setBackgroundColor(Color.GREEN);
                break;
            case R.id.blue_font:
                textView.setBackgroundColor(Color.BLUE);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
