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

        final Button cardButton = binding.cardbutton;

        cardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardButton.setTextSize(100);
                if (cardButton.getText() == "A") {
                    cardButton.setText("1");
                }
                else if (cardButton.getText() == "1") {
                    cardButton.setText("B");
                }
                else if (cardButton.getText() == "B") {
                    cardButton.setText("2");
                }
                else if (cardButton.getText() == "2") {
                    cardButton.setText("C");
                }
                else if (cardButton.getText() == "C") {
                    cardButton.setText("3");
                }
                else if (cardButton.getText() == "3") {
                    cardButton.setText("D");
                }
                else if (cardButton.getText() == "D") {
                    cardButton.setText("4");
                }
                else if (cardButton.getText() == "4") {
                    cardButton.setText("E");
                }
                else if (cardButton.getText() == "E") {
                    cardButton.setText("5");
                }
                else if (cardButton.getText() == "5") {
                    cardButton.setText("S");
                }
                else if (cardButton.getText() == "S") {
                    cardButton.setText("6");
                }
                else if (cardButton.getText() == "6") {
                    cardButton.setText("G");
                }
                else if (cardButton.getText() == "G") {
                    cardButton.setText("7");
                }
                else if (cardButton.getText() == "7") {
                    cardButton.setText("H");
                }
                else if (cardButton.getText() == "H") {
                    cardButton.setText("8");
                }
                else if (cardButton.getText() == "8") {
                    cardButton.setText("N");
                }
                else if (cardButton.getText() == "N") {
                    cardButton.setText("9");
                }
                else if (cardButton.getText() == "9") {
                    cardButton.setText("O");
                }
                else if (cardButton.getText() == "O") {
                    cardButton.setText("0");
                }
                else {
                    cardButton.setText("A");
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