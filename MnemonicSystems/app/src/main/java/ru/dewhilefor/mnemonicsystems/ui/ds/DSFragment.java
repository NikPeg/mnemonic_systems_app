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

import ru.dewhilefor.mnemonicsystems.R;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentDsBinding;

public class DSFragment extends Fragment {

    private FragmentDsBinding binding;

    private final String[] buttonTexts = {"A", "1", "B", "2", "C", "3", "D", "4", "E", "5", "S", "6", "G", "7", "H", "8", "N", "9", "O", "0"};

    private final int[] buttonColors = {R.color.orange_red, R.color.magneta};
    private int current_card_index = 0;

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
                DScardButton.setText(buttonTexts[current_card_index]); // cycle through the buttonTexts array
                DScardButton.setBackgroundColor(getResources().getColor(buttonColors[current_card_index % 2]));
                current_card_index = (current_card_index + 1) % buttonTexts.length;
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