package ru.dewhilefor.mnemonicsystems.ui;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textfield.TextInputEditText;

import ru.dewhilefor.mnemonicsystems.Number;
import ru.dewhilefor.mnemonicsystems.R;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentAddNumbersBinding;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentEditBinding;
import ru.dewhilefor.mnemonicsystems.ui.numbers.NumbersFragment;


public class EditFragment extends Fragment {

    private FragmentEditBinding binding;
    private int numberIndex;
    private Number currentNumber;
    public EditFragment(int cardIndex) {
        numberIndex = cardIndex;
        currentNumber = Number.numbers.get(numberIndex);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEditBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        TextInputEditText nameEditText = root.findViewById(R.id.et_number_name);
        nameEditText.setText(currentNumber.name);

        TextInputEditText valueEditText = root.findViewById(R.id.et_number_value);
        valueEditText.setText(currentNumber.value);

        TextInputEditText phraseEditText = root.findViewById(R.id.et_number_phrase);
        phraseEditText.setText(currentNumber.phrase);

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

        Button nextButton = binding.saveButton;

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nameEditText.getText().toString().trim().isEmpty() || valueEditText.getText().toString().trim().isEmpty()) {
                    new MaterialAlertDialogBuilder(requireContext())
                            .setTitle(R.string.specify_info)
                            .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
//                                setLocale("");
                                }
                            })
                            .show();
                }
                else {
                    Number.numbers.get(numberIndex).name = nameEditText.getText().toString().trim();
                    Number.numbers.get(numberIndex).value = valueEditText.getText().toString().trim();
                    Number.numbers.get(numberIndex).phrase = phraseEditText.getText().toString().trim();
                    getFragmentManager().beginTransaction()
                            .replace(R.id.nav_host_fragment_activity_main, new NumbersFragment())
                            .addToBackStack(null)
                            .commit();
                }
            }
        });
        return root;
    }
}