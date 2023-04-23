package ru.dewhilefor.mnemonicsystems.ui;

import static java.lang.Math.min;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import ru.dewhilefor.mnemonicsystems.R;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentAddNumbersBinding;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentChooseWordsBinding;
import ru.dewhilefor.mnemonicsystems.ui.numbers.NumbersFragment;

public class ChooseWordsFragment extends Fragment {
    private FragmentChooseWordsBinding binding;

    private int[] buttonStates = new int[]{0, 0, 0, 0, 0, 0};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentChooseWordsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        FloatingActionButton digit1Button = binding.Digit1Button;

        digit1Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (buttonStates[0] == 0) {
                    digit1Button.setBackgroundTintList(
                            ColorStateList.valueOf(getResources().getColor(R.color.orange_red))
                    );
                    buttonStates[0] = 1;
                }
                else if (buttonStates[0] == 1) {
                    digit1Button.setBackgroundTintList(
                            ColorStateList.valueOf(getResources().getColor(R.color.brighter_magneta))
                    );
                    buttonStates[0] = 2;
                }
            }
        });

        FloatingActionButton digit2Button = binding.Digit2Button;

        digit2Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (buttonStates[1] == 0) {
                    digit2Button.setBackgroundTintList(
                            ColorStateList.valueOf(getResources().getColor(R.color.orange_red))
                    );
                    buttonStates[1] = 1;
                }
                else if (buttonStates[1] == 1) {
                    digit2Button.setBackgroundTintList(
                            ColorStateList.valueOf(getResources().getColor(R.color.brighter_magneta))
                    );
                    buttonStates[1] = 2;
                }
            }
        });

        FloatingActionButton digit3Button = binding.Digit3Button;

        digit3Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (buttonStates[2] == 0) {
                    digit3Button.setBackgroundTintList(
                            ColorStateList.valueOf(getResources().getColor(R.color.orange_red))
                    );
                    buttonStates[2] = 1;
                }
                else if (buttonStates[2] == 1) {
                    digit3Button.setBackgroundTintList(
                            ColorStateList.valueOf(getResources().getColor(R.color.brighter_magneta))
                    );
                    buttonStates[2] = 2;
                }
            }
        });

        FloatingActionButton digit4Button = binding.Digit4Button;

        digit4Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (buttonStates[3] == 0) {
                    digit4Button.setBackgroundTintList(
                            ColorStateList.valueOf(getResources().getColor(R.color.orange_red))
                    );
                    buttonStates[3] = 1;
                }
                else if (buttonStates[3] == 1) {
                    digit4Button.setBackgroundTintList(
                            ColorStateList.valueOf(getResources().getColor(R.color.brighter_magneta))
                    );
                    buttonStates[3] = 2;
                }
            }
        });

        FloatingActionButton digit5Button = binding.Digit5Button;

        digit5Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (buttonStates[4] == 0) {
                    digit5Button.setBackgroundTintList(
                            ColorStateList.valueOf(getResources().getColor(R.color.orange_red))
                    );
                    buttonStates[4] = 1;
                }
                else if (buttonStates[4] == 1) {
                    digit5Button.setBackgroundTintList(
                            ColorStateList.valueOf(getResources().getColor(R.color.brighter_magneta))
                    );
                    buttonStates[4] = 2;
                }
            }
        });

        FloatingActionButton digit6Button = binding.Digit6Button;

        digit6Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (buttonStates[5] == 0) {
                    digit6Button.setBackgroundTintList(
                            ColorStateList.valueOf(getResources().getColor(R.color.orange_red))
                    );
                    buttonStates[5] = 1;
                }
                else if (buttonStates[5] == 1) {
                    digit6Button.setBackgroundTintList(
                            ColorStateList.valueOf(getResources().getColor(R.color.brighter_magneta))
                    );
                    buttonStates[5] = 2;
                }
            }
        });

        Button addNumberButton = binding.addNumberButton;

        addNumberButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment_activity_main, new NumbersFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        return root;
    }
}