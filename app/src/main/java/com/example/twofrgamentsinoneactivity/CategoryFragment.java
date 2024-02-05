package com.example.twofrgamentsinoneactivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;
import androidx.lifecycle.ViewModelProvider;

public class CategoryFragment extends ListFragment {


    public static CategoryFragment newInstance() {
        return new CategoryFragment();
    }

    String[] monthsName = new String[]{
            "JAN",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "July"
    };

    String[] num = new String[]{
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7"
    };

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.category_fragment, container, false);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, monthsName);

        setListAdapter(adapter);

        return view;
    }


    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        ItemsFragment txt = (ItemsFragment) getFragmentManager().findFragmentById(R.id.fragmentB);
        txt.change(monthsName[position], "Number : " + num[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);

    }
}