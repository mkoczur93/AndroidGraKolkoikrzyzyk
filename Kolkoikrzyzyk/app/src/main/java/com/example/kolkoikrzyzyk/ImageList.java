package com.example.kolkoikrzyzyk;

import android.app.LauncherActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;


public class ImageList extends AppCompatActivity {

    ListView list;
    Button back;
    Integer[] images={
            R.drawable.kolko,
            R.drawable.krzyzyk,
            R.drawable.obrazek1,
            R.drawable.obrazek2,
            R.drawable.ann,
            R.drawable.chrome,
            R.drawable.facebook,
            R.drawable.instagram,
            R.drawable.mozzila,
            R.drawable.youtube,
    };
    String image2;
    String image4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_image);
        String image1 = getIntent().getStringExtra("listimage1");
        image2 = image1;
        String image3 = getIntent().getStringExtra("listimage2");
        image4 = image3;
        Toast.makeText(ImageList.this,image4,Toast.LENGTH_SHORT).show();
        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (ImageList.this, MainActivity.class);
                intent.putExtra("image1", image2);
                intent.putExtra("image2", image4);
                finish();
                startActivity(intent);



            }
        });
        list = (ListView) findViewById(R.id.lista);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent (ImageList.this, MainActivity.class);
                String image = ("" +position);
                intent.putExtra("image1", image);
                intent.putExtra("image2", image4);
                finish();
                startActivity(intent);


            }
        });
        CustomAdapter customAdapter = new CustomAdapter();
        list.setAdapter(customAdapter);



    }
   public class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {


            if (position == 0)
            {
                if ("0".equals(image2) || TextUtils.isEmpty(image2) || "0".equals(image4))

                {
                    View view = getLayoutInflater().inflate(R.layout.row, null);
                    ImageView mImageView = (ImageView) view.findViewById(R.id.textList);
                    return view;
                }


            }


            if (position == 1)
            {
                if ("1".equals(image2)|| TextUtils.isEmpty(image4) || "1".equals(image4))

                {
                    View view = getLayoutInflater().inflate(R.layout.row, null);
                    ImageView mImageView = (ImageView) view.findViewById(R.id.textList);
                    return view;
                }

            }
            if (position == 2)
            {
                if ("2".equals(image2) || "2".equals(image4))

                {
                    View view = getLayoutInflater().inflate(R.layout.row, null);
                    ImageView mImageView = (ImageView) view.findViewById(R.id.textList);
                    return view;
                }

            }
            if (position == 3)
            {
                if ("3".equals(image2) || "3".equals(image4))

                {
                    View view = getLayoutInflater().inflate(R.layout.row, null);
                    ImageView mImageView = (ImageView) view.findViewById(R.id.textList);
                    return view;
                }

            }
            if (position == 4)
            {
                if ("4".equals(image2) || "4".equals(image4))

                {
                    View view = getLayoutInflater().inflate(R.layout.row, null);
                    ImageView mImageView = (ImageView) view.findViewById(R.id.textList);
                    return view;
                }

            }
            if (position == 5)
            {
                if ("5".equals(image2) || "5".equals(image4))

                {
                    View view = getLayoutInflater().inflate(R.layout.row, null);
                    ImageView mImageView = (ImageView) view.findViewById(R.id.textList);
                    return view;
                }

            }
            if (position == 6)
            {
                if ("6".equals(image2) || "6".equals(image4))

                {
                    View view = getLayoutInflater().inflate(R.layout.row, null);
                    ImageView mImageView = (ImageView) view.findViewById(R.id.textList);
                    return view;
                }

            }
            if (position == 7)
            {
                if ("7".equals(image2) || "7".equals(image4))

                {
                    View view = getLayoutInflater().inflate(R.layout.row, null);
                    ImageView mImageView = (ImageView) view.findViewById(R.id.textList);
                    return view;
                }

            }
            if (position == 8)
            {
                if ("8".equals(image2) || "8".equals(image4))

                {
                    View view = getLayoutInflater().inflate(R.layout.row, null);
                    ImageView mImageView = (ImageView) view.findViewById(R.id.textList);
                    return view;
                }

            }

            if (position == 9)
            {
                if ("9".equals(image2) || "9".equals(image4))

                {
                    View view = getLayoutInflater().inflate(R.layout.row, null);
                    ImageView mImageView = (ImageView) view.findViewById(R.id.textList);
                    return view;
                }

            }



            View view = getLayoutInflater().inflate(R.layout.row, null);
            ImageView mImageView = (ImageView) view.findViewById(R.id.textList);
            mImageView.setImageResource(images[position]);
            return view;


        }
    }
}
