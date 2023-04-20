package ru.dewhilefor.mnemonicsystems.ui;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import ru.dewhilefor.mnemonicsystems.R;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentAddNumbersBinding;

public class AddNumbersFragment extends Fragment {

    private FragmentAddNumbersBinding binding;

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
        binding = FragmentAddNumbersBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button chooseSystemButton = binding.chooseSystemButton;

        chooseSystemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialAlertDialogBuilder(requireContext())
                        .setTitle(R.string.choose_system)
                        .setPositiveButton(R.string.text_mms, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
//                                setLocale("");
                            }
                        })
                        .setNegativeButton(R.string.text_ds, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
//                                setLocale("en");
                            }
                        })
                        .show();
            }
        });
        return root;
    }
}