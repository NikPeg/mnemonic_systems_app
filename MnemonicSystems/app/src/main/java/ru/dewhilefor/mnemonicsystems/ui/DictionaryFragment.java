package ru.dewhilefor.mnemonicsystems.ui;

import static java.lang.Math.min;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

import kotlin.text.Charsets;
import ru.dewhilefor.mnemonicsystems.R;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentChooseWordsBinding;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentDictionaryBinding;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentMmsBinding;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentNumbersBinding;
import ru.dewhilefor.mnemonicsystems.ui.mms.MMSViewModel;
import ru.dewhilefor.mnemonicsystems.ui.numbers.NumbersFragment;

public class DictionaryFragment extends Fragment {
    private FragmentDictionaryBinding binding;
    private final static String FILE_NAME_RU = "dict-ru.txt";
    private final static String FILE_NAME_EN = "dict-en.txt";
    private String localFile;
    private InputStream inputStream;

    private void setDict(TextView textView) {
        Locale current = getResources().getConfiguration().locale;
        localFile = (current == Locale.ENGLISH) ? FILE_NAME_EN : FILE_NAME_RU;
        try {
            inputStream = getContext().getAssets().open(localFile);
            Scanner s = new Scanner(inputStream).useDelimiter("\\A");
            for (int i = 0; i < 200 && s.hasNextLine(); ++i) {
                textView.append(s.nextLine());
            }
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addNextLinesFromFile(TextView textView) {
        Scanner s = new Scanner(inputStream).useDelimiter("\\A");
        for (int i = 0; i < 200 && s.hasNextLine(); ++i) {
            textView.append(s.nextLine());
        }
        s.close();
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

        NestedScrollView dictScrollView = (NestedScrollView) root.findViewById(R.id.dictScrollView);

        if (dictScrollView != null) {

            dictScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
                @Override
                public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

                    int scrollViewHeight = v.getHeight();
                    int textViewHeight = textView.getHeight();
                    int totalScrollHeight = scrollY + scrollViewHeight;

                    if (totalScrollHeight >= textViewHeight) {
                        addNextLinesFromFile(textView);
                    }
                }
            });
        }

        return root;
    }
}