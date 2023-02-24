package ru.dewhilefor.mnemonicsystems.ui.ds;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import ru.dewhilefor.mnemonicsystems.databinding.FragmentMmsBinding;

public class DSFragment extends Fragment {

    private FragmentMmsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DSViewModel dsViewModel =
                new ViewModelProvider(this).get(DSViewModel.class);

        binding = FragmentMmsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textMms;
        dsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}