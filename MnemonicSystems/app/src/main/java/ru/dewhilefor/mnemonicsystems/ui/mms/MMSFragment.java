package ru.dewhilefor.mnemonicsystems.ui.mms;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import ru.dewhilefor.mnemonicsystems.R;
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

        Button MMSCardButton = binding.mmscardbutton;

        MMSCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MMSCardButton.setTextSize(100);
                if (MMSCardButton.getText() == "A") {
                    MMSCardButton.setText("1");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.orange_red));
                } else if (MMSCardButton.getText() == "1") {
                    MMSCardButton.setText("B");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.magneta));
                } else if (MMSCardButton.getText() == "B") {
                    MMSCardButton.setText("2");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.orange_red));
                } else if (MMSCardButton.getText() == "2") {
                    MMSCardButton.setText("C");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.magneta));
                } else if (MMSCardButton.getText() == "C") {
                    MMSCardButton.setText("3");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.orange_red));
                } else if (MMSCardButton.getText() == "3") {
                    MMSCardButton.setText("D");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.magneta));
                } else if (MMSCardButton.getText() == "D") {
                    MMSCardButton.setText("4");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.orange_red));
                } else if (MMSCardButton.getText() == "4") {
                    MMSCardButton.setText("E");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.magneta));
                } else if (MMSCardButton.getText() == "E") {
                    MMSCardButton.setText("5");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.orange_red));
                } else if (MMSCardButton.getText() == "5") {
                    MMSCardButton.setText("S");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.magneta));
                } else if (MMSCardButton.getText() == "S") {
                    MMSCardButton.setText("6");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.orange_red));
                } else if (MMSCardButton.getText() == "6") {
                    MMSCardButton.setText("G");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.magneta));
                } else if (MMSCardButton.getText() == "G") {
                    MMSCardButton.setText("7");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.orange_red));
                } else if (MMSCardButton.getText() == "7") {
                    MMSCardButton.setText("H");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.magneta));
                } else if (MMSCardButton.getText() == "H") {
                    MMSCardButton.setText("8");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.orange_red));
                } else if (MMSCardButton.getText() == "8") {
                    MMSCardButton.setText("N");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.magneta));
                } else if (MMSCardButton.getText() == "N") {
                    MMSCardButton.setText("9");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.orange_red));
                } else if (MMSCardButton.getText() == "9") {
                    MMSCardButton.setText("O");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.magneta));
                } else if (MMSCardButton.getText() == "O") {
                    MMSCardButton.setText("0");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.orange_red));
                } else {
                    MMSCardButton.setText("A");
                    MMSCardButton.setBackgroundColor(getResources().getColor(R.color.magneta));
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