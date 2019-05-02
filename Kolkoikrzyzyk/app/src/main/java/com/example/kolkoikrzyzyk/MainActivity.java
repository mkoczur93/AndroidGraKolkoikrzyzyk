package com.example.kolkoikrzyzyk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button buttonnext;
    EditText namegracz1;
    EditText namegracz2;

    public String name1;
    public String name2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        namegracz1 = (EditText) findViewById(R.id.namegracz1);
        namegracz2 = (EditText) findViewById(R.id.namegracz2);
        buttonnext = (Button) findViewById (R.id.button);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sprawdzname1();
                sprawdzname2();
                Intent intent = new Intent (MainActivity.this, Main2Activity.class);
                intent.putExtra("name1", name1);
                intent.putExtra("name2", name2);
                startActivity(intent);


            }
        });
            }

    String sprawdzname1()
    {if(namegracz1.getText().toString().isEmpty())
    {
        name1 = "GRACZ 1";

    }
    else
    {
        name1 = namegracz1.getText().toString();

    }
        return name1;
    };

    String sprawdzname2()
    {if(namegracz2.getText().toString().isEmpty())
    {
        name2 = "GRACZ 2";

    }
    else
    {
        name2 = namegracz2.getText().toString();

    }
        return name2;
    };


}
