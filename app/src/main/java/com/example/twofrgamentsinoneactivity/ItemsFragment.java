package com.example.twofrgamentsinoneactivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class ItemsFragment extends Fragment {



    public static ItemsFragment newInstance() {
        return new ItemsFragment();
    }

    TextView textView, textView1;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.items_fragment, container, false);

        textView = view.findViewById(R.id.tvOutput);
        textView1 = view.findViewById(R.id.tvOutput1);

        return view;
    }



    public void change(String s, String txt) {
        textView.setText(txt);
        textView1.setText(s);
    }

}