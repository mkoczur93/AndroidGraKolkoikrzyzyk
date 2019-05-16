package com.example.kolkoikrzyzyk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    Button buttonnext;
    EditText namegracz1;
    EditText namegracz2;
    ImageView openlist1;
    ImageView openlist2;

    public String name1;
    public String name2;
    public String image0;
    public String image3;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        namegracz1 = (EditText) findViewById(R.id.namegracz1);
        namegracz2 = (EditText) findViewById(R.id.namegracz2);
        openlist1 = (ImageView) findViewById(R.id.openlist1);
        openlist2 = (ImageView) findViewById(R.id.openlist2);
        String image1 = getIntent().getStringExtra("image1");
        image0 = image1;
        String image2 = getIntent().getStringExtra("image2");
        image3 = image2;
        String name4 = getIntent().getStringExtra("name1");
        name1 = name4;
        String name3 = getIntent().getStringExtra("name2");
        name2 = name3;
        ustawImageGracz1();
        ustawImageGracz2();
        if(!"GRACZ 1".equals(name1))
            namegracz1.setText(name1);
        if(!"GRACZ 2".equals(name2))
            namegracz2.setText(name2);









        openlist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent (MainActivity.this, ImageList.class);
                intent1.putExtra("listimage1", image0);
                intent1.putExtra("listimage2", image3);
                sprawdzname1();
                sprawdzname2();
                intent1.putExtra("name1", name1);
                intent1.putExtra("name2", name2);
                startActivity(intent1);


            }
        });

        openlist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent (MainActivity.this, ImageList2.class);
                intent1.putExtra("listimage1", image0);
                intent1.putExtra("listimage2", image3);
                sprawdzname1();
                sprawdzname2();
                intent1.putExtra("name1", name1);
                intent1.putExtra("name2", name2);
                startActivity(intent1);

            }
        });

        buttonnext = (Button) findViewById (R.id.button);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sprawdzname1();
                sprawdzname2();
                Intent intent = new Intent (MainActivity.this, Main2Activity.class);
                intent.putExtra("name1", name1);
                intent.putExtra("name2", name2);
                intent.putExtra("listimage1", image0);
                intent.putExtra("listimage2", image3);
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




    void ustawImageGracz1()
    {
        if("0".equals(image0) || TextUtils.isEmpty(image0)) {
            openlist1.setBackgroundResource(R.drawable.kolko);
        }
        else if("1".equals(image0)) {
            openlist1.setBackgroundResource(R.drawable.krzyzyk);
        }
        else if("2".equals(image0)) {
            openlist1.setBackgroundResource(R.drawable.obrazek1);
        }
        else if("3".equals(image0)) {
            openlist1.setBackgroundResource(R.drawable.obrazek2);
        }
        else if("4".equals(image0)) {
            openlist1.setBackgroundResource(R.drawable.ann);
        }
        else if("5".equals(image0)) {
            openlist1.setBackgroundResource(R.drawable.chrome);
        }
        else if("6".equals(image0)) {
            openlist1.setBackgroundResource(R.drawable.facebook);
        }
        else if("7".equals(image0)) {
            openlist1.setBackgroundResource(R.drawable.instagram);
        }
        else if("8".equals(image0)) {
            openlist1.setBackgroundResource(R.drawable.mozzila);
        }
        else if("9".equals(image0)) {
            openlist1.setBackgroundResource(R.drawable.youtube);
        }

    };

    void ustawImageGracz2()
    {
        if("0".equals(image3) ) {
            openlist2.setBackgroundResource(R.drawable.kolko);
        }
        else if("1".equals(image3) || TextUtils.isEmpty(image3)) {
            openlist2.setBackgroundResource(R.drawable.krzyzyk);
        }
        else if("2".equals(image3)) {
            openlist2.setBackgroundResource(R.drawable.obrazek1);
        }
        else if("3".equals(image3)) {
            openlist2.setBackgroundResource(R.drawable.obrazek2);
        }
        else if("4".equals(image3)) {
            openlist2.setBackgroundResource(R.drawable.ann);
        }
        else if("5".equals(image3)) {
            openlist2.setBackgroundResource(R.drawable.chrome);
        }
        else if("6".equals(image3)) {
            openlist2.setBackgroundResource(R.drawable.facebook);
        }
        else if("7".equals(image3)) {
            openlist2.setBackgroundResource(R.drawable.instagram);
        }
        else if("8".equals(image3)) {
            openlist2.setBackgroundResource(R.drawable.mozzila);
        }
        else if("9".equals(image3)) {
            openlist2.setBackgroundResource(R.drawable.youtube);
        }

    };

}
