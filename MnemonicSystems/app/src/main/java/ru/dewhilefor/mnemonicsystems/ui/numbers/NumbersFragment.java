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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ru.dewhilefor.mnemonicsystems.Number;
import ru.dewhilefor.mnemonicsystems.R;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentNumbersBinding;
import ru.dewhilefor.mnemonicsystems.ui.AddNumbersFragment;
import ru.dewhilefor.mnemonicsystems.ui.DictionaryFragment;
import ru.dewhilefor.mnemonicsystems.ui.EditFragment;

public class NumbersFragment extends Fragment {

    private FragmentNumbersBinding binding;
    private final int[] cards = new int[]{R.id.cardView0, R.id.cardView1, R.id.cardView2, R.id.cardView3, R.id.cardView4, R.id.cardView5, R.id.cardView6, R.id.cardView7, R.id.cardView8, R.id.cardView9};
    private final int[] cardsTexts = new int[]{R.id.cardTextView0, R.id.cardTextView1, R.id.cardTextView2, R.id.cardTextView3, R.id.cardTextView4, R.id.cardTextView5, R.id.cardTextView6, R.id.cardTextView7, R.id.cardTextView8, R.id.cardTextView9};
    private final int[] cardsTexts1 = new int[]{R.id.cardTextView10, R.id.cardTextView11, R.id.cardTextView22, R.id.cardTextView33, R.id.cardTextView44, R.id.cardTextView55, R.id.cardTextView66, R.id.cardTextView77, R.id.cardTextView88, R.id.cardTextView99};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NumbersViewModel numbersViewModel =
                new ViewModelProvider(this).get(NumbersViewModel.class);

        binding = FragmentNumbersBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        for (int i = 0; i < Number.numbers.size(); ++i) {
            CardView nextCardView = root.findViewById(cards[i]);
            nextCardView.setVisibility(View.VISIBLE);
            TextView nextCardTextView = root.findViewById(cardsTexts[i]);
            nextCardTextView.setText(Number.numbers.get(i).title());
            nextCardTextView = root.findViewById(cardsTexts1[i]);
            nextCardTextView.setText(Number.numbers.get(i).title());
        }

        FloatingActionButton addButton = root.findViewById(R.id.AddButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment_activity_main, new AddNumbersFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        for (int i = 0; i < cards.length; ++i) {

            CardView cardView = root.findViewById(cards[i]);
            int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getFragmentManager().beginTransaction()
                            .replace(R.id.nav_host_fragment_activity_main, new EditFragment(finalI))
                            .addToBackStack(null)
                            .commit();
                }
            });
        }

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}