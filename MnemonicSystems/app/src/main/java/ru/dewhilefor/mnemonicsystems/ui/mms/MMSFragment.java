package ru.dewhilefor.mnemonicsystems.ui.mms;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import ru.dewhilefor.mnemonicsystems.databinding.FragmentMmsBinding;

public class MMSFragment extends Fragment {

    private FragmentMmsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MMSViewModel mmsViewModel =
                new ViewModelProvider(this).get(MMSViewModel.class);

        binding = FragmentMmsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textMms;
        mmsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        final Button MMSCardButton = binding.mmscardbutton;

        MMSCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MMSCardButton.setTextSize(100);
                if (MMSCardButton.getText() == "A") {
                    MMSCardButton.setText("1");
                }
                else if (MMSCardButton.getText() == "1") {
                    MMSCardButton.setText("B");
                }
                else if (MMSCardButton.getText() == "B") {
                    MMSCardButton.setText("2");
                }
                else if (MMSCardButton.getText() == "2") {
                    MMSCardButton.setText("C");
                }
                else if (MMSCardButton.getText() == "C") {
                    MMSCardButton.setText("3");
                }
                else if (MMSCardButton.getText() == "3") {
                    MMSCardButton.setText("D");
                }
                else if (MMSCardButton.getText() == "D") {
                    MMSCardButton.setText("4");
                }
                else if (MMSCardButton.getText() == "4") {
                    MMSCardButton.setText("E");
                }
                else if (MMSCardButton.getText() == "E") {
                    MMSCardButton.setText("5");
                }
                else if (MMSCardButton.getText() == "5") {
                    MMSCardButton.setText("S");
                }
                else if (MMSCardButton.getText() == "S") {
                    MMSCardButton.setText("6");
                }
                else if (MMSCardButton.getText() == "6") {
                    MMSCardButton.setText("G");
                }
                else if (MMSCardButton.getText() == "G") {
                    MMSCardButton.setText("7");
                }
                else if (MMSCardButton.getText() == "7") {
                    MMSCardButton.setText("H");
                }
                else if (MMSCardButton.getText() == "H") {
                    MMSCardButton.setText("8");
                }
                else if (MMSCardButton.getText() == "8") {
                    MMSCardButton.setText("N");
                }
                else if (MMSCardButton.getText() == "N") {
                    MMSCardButton.setText("9");
                }
                else if (MMSCardButton.getText() == "9") {
                    MMSCardButton.setText("O");
                }
                else if (MMSCardButton.getText() == "O") {
                    MMSCardButton.setText("0");
                }
                else {
                    MMSCardButton.setText("A");
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