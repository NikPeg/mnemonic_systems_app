package ru.dewhilefor.mnemonicsystems.ui.numbers;

import static java.lang.Math.min;

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

import java.util.List;

import ru.dewhilefor.mnemonicsystems.R;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentNumbersBinding;

public class NumbersFragment extends Fragment {

    private FragmentNumbersBinding binding;
    private final int[] cards = new int[]{R.id.cardView0, R.id.cardView1, R.id.cardView2, R.id.cardView3, R.id.cardView4, R.id.cardView5, R.id.cardView6, R.id.cardView7, R.id.cardView8, R.id.cardView9};
    private int lastCard = 0;

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
                lastCard = min(cards.length - 1, lastCard + 1);
                CardView nextCardView = root.findViewById(cards[lastCard]);
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