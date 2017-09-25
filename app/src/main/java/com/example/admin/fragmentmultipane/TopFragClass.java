package com.example.admin.fragmentmultipane;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ADMIN on 9/25/2017.
 */

public class TopFragClass extends Fragment
{
    EditText nameText,passText;
    Button button;
    TopFragListener topFragListener;

    public interface TopFragListener
    {
        void setText(String name,String pass);
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            topFragListener = (TopFragListener) activity;
        }
        catch(ClassCastException ce)
        {

        }
    }

    @Nullable
    @Override
     public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.top_frag,container,false);

        nameText = (EditText)view.findViewById(R.id.name);
        passText = (EditText)view.findViewById(R.id.pass);
        button   = (Button)view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                buttonClick(nameText.getText().toString(),passText.getText().toString());
            }
        });
        return view;
    }

    private void buttonClick(String name,String pass)
    {
        topFragListener.setText(name,pass);
    }
}
