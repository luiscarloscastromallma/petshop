package com.example.petshop.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.petshop.R;
import com.example.petshop.adapters.ProductItemAdapters;
import com.example.petshop.models.Product;

import java.util.ArrayList;

public class ProductlistActivity extends AppCompatActivity {
    ListView listViewProducts;
    ProductItemAdapters itemsAdapter;
    ArrayList<Product> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productlist);

        listViewProducts = (ListView) findViewById(R.id.listaProducto);

        items = new ArrayList<>();
        items = Product.getData();



        itemsAdapter =
                new ProductItemAdapters(this, items);

        listViewProducts.setAdapter(itemsAdapter);

    }
}
