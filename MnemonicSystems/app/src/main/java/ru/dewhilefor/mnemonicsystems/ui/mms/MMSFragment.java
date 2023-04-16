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
    private final String[] buttonTexts = {"A", "1", "B", "2", "C", "3", "D", "4", "E", "5", "S", "6", "G", "7", "H", "8", "N", "9", "O", "0"};

    private final int[] buttonColors = {R.color.orange_red, R.color.magneta};
    private int current_card_index = 0;


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
                MMSCardButton.setText(buttonTexts[current_card_index]); // cycle through the buttonTexts array
                MMSCardButton.setBackgroundColor(getResources().getColor(buttonColors[current_card_index % 2]));
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