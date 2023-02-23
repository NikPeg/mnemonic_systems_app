package ru.dewhilefor.mnemonicsystems.ui.numbers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import ru.dewhilefor.mnemonicsystems.databinding.FragmentNumbersBinding;

public class NumbersFragment extends Fragment {

    private FragmentNumbersBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NumbersViewModel numbersViewModel =
                new ViewModelProvider(this).get(NumbersViewModel.class);

        binding = FragmentNumbersBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textNumbers;
        numbersViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}