package ru.dewhilefor.mnemonicsystems.ui;

import static java.lang.Math.min;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.FileInputStream;
import java.io.IOException;

import ru.dewhilefor.mnemonicsystems.R;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentChooseWordsBinding;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentDictionaryBinding;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentMmsBinding;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentNumbersBinding;
import ru.dewhilefor.mnemonicsystems.ui.mms.MMSViewModel;
import ru.dewhilefor.mnemonicsystems.ui.numbers.NumbersFragment;

public class DictionaryFragment extends Fragment {
    private FragmentDictionaryBinding binding;
    private final static String FILE_NAME = "dict.txt";

    private void setDict(TextView textView) {
//        FileInputStream fin = null;
//        try {
//            fin = getActivity().openFileInput(FILE_NAME);
//            byte[] bytes = new byte[fin.available()];
//            fin.read(bytes);
//            String text = new String(bytes);
//            textView.setText(text);
//        } catch (NullPointerException ex) {
//            Toast.makeText(getActivity(), "There is no activity: " + ex.getMessage(), Toast.LENGTH_SHORT).show();
//        } catch (IOException ex) {
//            Toast.makeText(getActivity(), "There is no file: " + ex.getMessage(), Toast.LENGTH_SHORT).show();
//        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentDictionaryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        TextView textView = root.findViewById(R.id.text_dictionary);
        setDict(textView);

        FloatingActionButton addButton = binding.AddButton;

        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(getContext());

                alert.setTitle("Title");
                alert.setMessage("Message");

                final EditText input = new EditText(getContext());
                alert.setView(input);

                alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String value = String.valueOf(input.getText());
                        // Do something with value!
                    }
                });

                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // Canceled.
                    }
                });

                alert.show();
            }
        });

        return root;
    }
}