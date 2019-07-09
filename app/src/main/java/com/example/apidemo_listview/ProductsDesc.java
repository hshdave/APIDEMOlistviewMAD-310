package com.example.apidemo_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ProductsDesc extends AppCompatActivity {


    ImageView img;
    TextView pname,price,pbrand,pdesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_desc);

        img = findViewById(R.id.desc_pimg);
        pname = findViewById(R.id.desc_pnames);
        pdesc = findViewById(R.id.desc_pdesc);
        pbrand = findViewById(R.id.desc_brand);
        price = findViewById(R.id.desc_price);

        Intent i = getIntent();

        Products p = i.getParcelableExtra("data");


        Picasso.get().load(p.getPimg()).into(img);

        pname.setText(p.getPname());
        pdesc.setText(p.getDesc());
        pbrand.setText(p.getBrand());
        price.setText(""+p.getPrice());

    }
}
