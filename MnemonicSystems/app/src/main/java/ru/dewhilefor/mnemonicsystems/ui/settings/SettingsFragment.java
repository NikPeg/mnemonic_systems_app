package ru.dewhilefor.mnemonicsystems.ui.settings;


import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import ru.dewhilefor.mnemonicsystems.R;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentSettingsBinding;
import ru.dewhilefor.mnemonicsystems.ui.ds.DSFragment;
import ru.dewhilefor.mnemonicsystems.ui.help.HelpFragment;
import ru.dewhilefor.mnemonicsystems.ui.mms.MMSFragment;
import ru.dewhilefor.mnemonicsystems.ui.numbers.NumbersFragment;

public class SettingsFragment extends Fragment {

    private FragmentSettingsBinding binding;
    private final String[] singleItems = new String[]{"Item 1", "Item 2", "Item 3"};
    private int checkedItem = 1;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SettingsViewModel settingsViewModel =
                new ViewModelProvider(this).get(SettingsViewModel.class);

        binding = FragmentSettingsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button languageButton = binding.languageButton;

        languageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialAlertDialogBuilder(requireContext())
                        .setTitle(R.string.text_choose_language)
                        .setPositiveButton(R.string.russian, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // действия при нажатии на кнопку "Да"
                            }
                        })
                        .setNegativeButton(R.string.english, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // действия при нажатии на кнопку "Нет"
                            }
                        })
                        .show();
            }
        });

        Button numbersButton = binding.numbersButton;

        numbersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment_activity_main, new NumbersFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        Button mmsButton = binding.mmsButton;

        mmsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment_activity_main, new MMSFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        Button helpButton = binding.helpButton;

        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment_activity_main, new HelpFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        Button dsButton = binding.dsButton;

        dsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment_activity_main, new DSFragment())
                        .addToBackStack(null)
                        .commit();
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