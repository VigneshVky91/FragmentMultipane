package com.example.admin.fragmentmultipane;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ADMIN on 9/25/2017.
 */

public class BottomFragClass extends Fragment
{
    TextView name,pass;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.bottom_frag,container,false);
        name = (TextView) view.findViewById(R.id.name);
        pass = (TextView) view.findViewById(R.id.pass);

        return view;

    }
    public void setNameAndPass(String name1,String pass1)
    {
        name.setText(name1);
        pass.setText(pass1);
    }
}
