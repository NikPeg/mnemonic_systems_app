package ru.dewhilefor.mnemonicsystems.ui.numbers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import ru.dewhilefor.mnemonicsystems.R;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentNumbersBinding;

public class NumbersFragment extends Fragment {

    private FragmentNumbersBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NumbersViewModel numbersViewModel =
                new ViewModelProvider(this).get(NumbersViewModel.class);

        binding = FragmentNumbersBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        FloatingActionButton addButton = root.findViewById(R.id.AddButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CardView nextCardView = root.findViewById(R.id.cardView1);
                nextCardView.setVisibility(View.VISIBLE);
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