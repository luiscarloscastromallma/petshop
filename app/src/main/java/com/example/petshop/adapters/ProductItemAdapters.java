package com.example.petshop.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.petshop.R;

import com.example.petshop.models.Product;

import java.util.List;




import java.util.List;
public class ProductItemAdapters extends ArrayAdapter<Product> {
Context context;


    private class ViewHolder {
        TextView name;
        TextView Description;
        Button monto;

        private ViewHolder(){
        }
    }
    public ProductItemAdapters(Context context, List<Product> items) {
        super(context, 0, items);
        this.context = context;
    }
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        final Product rowItem = (Product) getItem(position);
        LayoutInflater mInflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.adapter_product_item,null);
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.name);
            holder.Description = (TextView) convertView.findViewById(R.id.Description);

       //     holder.monto = (Button) convertView.findViewById(R.id.monto);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.name.setText(rowItem.getName());
        holder.Description.setText(rowItem.getDescription());

  //      holder.monto.setText(rowItem.getMonto()+ "");


//        holder.image.setImageBitmap(rowItem.getSmallBitMap());
        return convertView;
    }

}
