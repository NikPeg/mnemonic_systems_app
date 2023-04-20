package ru.dewhilefor.mnemonicsystems.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.dewhilefor.mnemonicsystems.R;

public class AddNumbersFragment extends Fragment {

    public AddNumbersFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static AddNumbersFragment newInstance() {
        AddNumbersFragment fragment = new AddNumbersFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_add_numbers, container, false);
    }
}