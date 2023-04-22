package ru.dewhilefor.mnemonicsystems.ui;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import ru.dewhilefor.mnemonicsystems.R;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentAddNumbersBinding;
import ru.dewhilefor.mnemonicsystems.ui.numbers.NumbersFragment;

public class AddNumbersFragment extends Fragment {

    private FragmentAddNumbersBinding binding;

    public AddNumbersFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static AddNumbersFragment newInstance() {
        AddNumbersFragment fragment = new AddNumbersFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAddNumbersBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button chooseSystemButton = binding.chooseSystemButton;

        chooseSystemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialAlertDialogBuilder(requireContext())
                        .setTitle(R.string.choose_system)
                        .setPositiveButton(R.string.text_mms, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
//                                setLocale("");
                            }
                        })
                        .setNegativeButton(R.string.text_ds, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
//                                setLocale("en");
                            }
                        })
                        .show();
            }
        });

        Button nextButton = binding.nextButton;

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextInputEditText et = root.findViewById(R.id.et_number_name);
                NumbersFragment.cardsTitles.add(et.getText().toString().trim());
                getFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment_activity_main, new ChooseWordsFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
        return root;
    }
}