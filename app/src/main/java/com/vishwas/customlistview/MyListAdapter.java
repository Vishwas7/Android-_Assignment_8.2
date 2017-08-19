package com.vishwas.customlistview;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.vishwas.customlistview.R;

/**
 * Created by Vishwas on 7/22/2017.
 * creating a class MyListAdapter and extends with ArrayAdapter wich will sport String values.
 */

public class MyListAdapter extends ArrayAdapter<String>{

    //declaring variables
    private final Activity context;
    private final String[] name;
    private final String[] number;

    /**
     * and in creating a constructor of MyListAdapter and passing requirements values
     * and in super class passing context, list_view layout xml and name...
     */

    public MyListAdapter(Activity context, String[] name, String[] number) {
        super(context, R.layout.list_view_contacts,name);
    // initializing the values
        this.context = context;
        this.name = name;
        this.number = number;
    }

    /**
     * using getView override method  this methods will help to view.
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // using LayoutInflater to fill layouts
        LayoutInflater inflater=context.getLayoutInflater();

        View rowView=inflater.inflate(R.layout.list_view_contacts,null,true);
        TextView txtName=(TextView)rowView.findViewById(R.id.textView_name);
        TextView txtContacts=(TextView)rowView.findViewById(R.id.textView_number);
        txtName.setText(name[position]);
        txtContacts.setText(number[position]);
        return rowView;
    }
}
