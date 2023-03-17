package ru.dewhilefor.mnemonicsystems.ui.ds;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import ru.dewhilefor.mnemonicsystems.databinding.FragmentDsBinding;

public class DSFragment extends Fragment {

    private FragmentDsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DSViewModel dsViewModel =
                new ViewModelProvider(this).get(DSViewModel.class);

        binding = FragmentDsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDs;
        dsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        final Button DScardButton = binding.dscardbutton;

        DScardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DScardButton.setTextSize(100);
                if (DScardButton.getText() == "A") {
                    DScardButton.setText("1");
                }
                else if (DScardButton.getText() == "1") {
                    DScardButton.setText("B");
                }
                else if (DScardButton.getText() == "B") {
                    DScardButton.setText("2");
                }
                else if (DScardButton.getText() == "2") {
                    DScardButton.setText("C");
                }
                else if (DScardButton.getText() == "C") {
                    DScardButton.setText("3");
                }
                else if (DScardButton.getText() == "3") {
                    DScardButton.setText("D");
                }
                else if (DScardButton.getText() == "D") {
                    DScardButton.setText("4");
                }
                else if (DScardButton.getText() == "4") {
                    DScardButton.setText("E");
                }
                else if (DScardButton.getText() == "E") {
                    DScardButton.setText("5");
                }
                else if (DScardButton.getText() == "5") {
                    DScardButton.setText("S");
                }
                else if (DScardButton.getText() == "S") {
                    DScardButton.setText("6");
                }
                else if (DScardButton.getText() == "6") {
                    DScardButton.setText("G");
                }
                else if (DScardButton.getText() == "G") {
                    DScardButton.setText("7");
                }
                else if (DScardButton.getText() == "7") {
                    DScardButton.setText("H");
                }
                else if (DScardButton.getText() == "H") {
                    DScardButton.setText("8");
                }
                else if (DScardButton.getText() == "8") {
                    DScardButton.setText("N");
                }
                else if (DScardButton.getText() == "N") {
                    DScardButton.setText("9");
                }
                else if (DScardButton.getText() == "9") {
                    DScardButton.setText("O");
                }
                else if (DScardButton.getText() == "O") {
                    DScardButton.setText("0");
                }
                else {
                    DScardButton.setText("A");
                }
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}