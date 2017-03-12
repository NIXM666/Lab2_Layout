package com.example.king.lab2_layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by 10069 on 2017/3/11.
 */
public class MainActivity extends AppCompatActivity {
    Button btn_liner, btn_relative, btn_table;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);

        btn_liner = (Button) findViewById(R.id.liner);
        btn_relative = (Button) findViewById(R.id.relative);
        btn_table = (Button) findViewById(R.id.table);

        btn_liner.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent intent = new Intent(MainActivity.this, LinearLayout.class);
                                             startActivity(intent);
                                         }
                                     }
        );

        btn_relative.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent intent = new Intent(MainActivity.this, RelativeLayout.class);
                                                startActivity(intent);
                                            }
                                        }
        );

        btn_table.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent intent = new Intent(MainActivity.this, TableLayout.class);
                                             startActivity(intent);
                                         }
                                     }
        );
    }
}
